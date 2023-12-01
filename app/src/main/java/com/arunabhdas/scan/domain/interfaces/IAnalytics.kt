package com.arunabhdas.scan.domain.interfaces

import com.arunabhdas.scan.utils.logging.CharacteristicEvent

interface IAnalytics {

    fun logCharacteristicEvent(analyticsEvent: CharacteristicEvent)
    //fun logScreenEvent(analyticsEvent: CharacteristicEvent)

}