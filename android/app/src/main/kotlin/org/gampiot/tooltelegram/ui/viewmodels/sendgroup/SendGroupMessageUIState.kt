package org.gampiot.tooltelegram.ui.viewmodels.sendgroup

import android.content.Context

data class SendGroupMessageUIState(
    val chatId: String = "-100",
    val token: String = "",
    val message: String = "Message by Tool Telegram",
    val isSuccess: Boolean = false
)