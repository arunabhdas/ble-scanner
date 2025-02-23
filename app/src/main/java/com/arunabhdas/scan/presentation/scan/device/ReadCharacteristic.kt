package com.arunabhdas.scan.presentation.scan.device

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.AssistChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.arunabhdas.scan.R
import com.arunabhdas.scan.domain.bleparsables.Appearance
import com.arunabhdas.scan.domain.models.DeviceCharacteristics
import com.arunabhdas.scan.domain.models.getReadInfo
import com.arunabhdas.scan.presentation.theme.codeFont
import timber.log.Timber

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ReadCharacteristic(
    char: DeviceCharacteristics,
    onRead: (String) -> Unit,
    onShowUserMessage: (String) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
        //.padding(6.dp)
    ) {
        AssistChip(
            enabled = char.canRead,
            label = { Text(text = "Read") },
            leadingIcon = {
                Icon(
                    painter = painterResource(
                        id = R.drawable.outline_arrow_circle_down
                    ),
                    contentDescription = "Read"
                )
            },
            onClick = { onRead(char.uuid) })
        Spacer(modifier = Modifier.width(10.dp))
        val clipboardManager = LocalClipboardManager.current
        AssistChip(
            enabled = char.readBytes != null,
            label = { Text(text = "Copy") },
            leadingIcon = {
                Icon(
                    modifier = Modifier.size(22.dp),
                    painter = painterResource(id = R.drawable.copy),
                    contentDescription = "Copy"
                )
            },
            onClick = {
                clipboardManager.setText(
                    AnnotatedString(char.getReadInfo())
                )
                onShowUserMessage("Data Copied.")
            })
    }

    Box(
        modifier =
        Modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 100.dp)
            .background(MaterialTheme.colorScheme.primaryContainer)
            .padding(6.dp)
    ) {
        SelectionContainer {
            Column {
                Timber.d(char.uuid)
                Timber.d(Appearance.uuid)

                Text(
                    text = char.getReadInfo(),
                    style = codeFont
                )
            }
        }
    }
}
