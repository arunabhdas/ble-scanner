package com.arunabhdas.scan.presentation.previewparams

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.arunabhdas.scan.domain.models.BleConnectEvents
import com.arunabhdas.scan.domain.models.BleReadWriteCommands
import com.arunabhdas.scan.domain.models.ConnectionState
import com.arunabhdas.scan.domain.models.DeviceEvents
import com.arunabhdas.scan.domain.models.ScanState
import com.arunabhdas.scan.domain.models.ScanUI
class PortraitListParams : PreviewParameterProvider<FeatureParams> {

    override val values = sequenceOf(
        FeatureParams(
            ScanState(
                ScanUI(
                    devices,
                    null,
                    ConnectionState.CONNECTING,
                    null,
                    null),
                BleConnectEvents({}, {}),
                BleReadWriteCommands(
                    {},
                    { _: String, _: String -> },
                    { _: String, _: String -> },
                    { _: String, _: String, _: String -> },
                ),
                DeviceEvents({}, {}, {},{},{})
            ),
            devices,
            deviceDetail,
            portrait
        ),
    )
}

class PortraitNarrowListParams : PreviewParameterProvider<FeatureParams> {

    override val values = sequenceOf(
        FeatureParams(
            ScanState(
                ScanUI(
                    devices,
                    null,
                    ConnectionState.CONNECTING,
                    null,
                    null),
                BleConnectEvents({}, {}),
                BleReadWriteCommands(
                    {},
                    { _: String, _: String -> },
                    { _: String, _: String -> },
                    { _: String, _: String, _: String -> },
                ),
                DeviceEvents({}, {}, {},{},{})
            ),
            devices,
            deviceDetail,
            portraitNarrow
        ),
    )
}

class LandscapeListParams : PreviewParameterProvider<FeatureParams> {

    override val values = sequenceOf(
        FeatureParams(
            ScanState(
                ScanUI(
                    devices,
                    null,
                    ConnectionState.CONNECTING,
                    null,
                    null),
                BleConnectEvents({}, {}),
                BleReadWriteCommands(
                    {},
                    { _: String, _: String -> },
                    { _: String, _: String -> },
                    { _: String, _: String, _: String -> },
                ),
                DeviceEvents({}, {}, {},{},{})
            ),
            devices,
            deviceDetail,
            landscapeNormal
        ),
    )
}
class LandscapeBigListParams : PreviewParameterProvider<FeatureParams> {

    override val values = sequenceOf(
        FeatureParams(
            ScanState(
                ScanUI(
                    devices,
                    null,
                    ConnectionState.CONNECTING,
                    null,
                    null),
                BleConnectEvents({}, {}),
                BleReadWriteCommands(
                    {},
                    { _: String, _: String -> },
                    { _: String, _: String -> },
                    { _: String, _: String, _: String -> },
                ),
                DeviceEvents({}, {}, {},{},{})
            ),
            devices,
            deviceDetail,
            landscapeBig
        ),
    )
}
