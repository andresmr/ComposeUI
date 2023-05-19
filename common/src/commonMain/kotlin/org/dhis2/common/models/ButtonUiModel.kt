package org.dhis2.common.models

data class ButtonUiModel(
    val text: String,
    val enabled: Boolean = true,
    val onClick: () -> Unit
)
