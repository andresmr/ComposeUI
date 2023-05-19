package org.dhis2.common

import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import org.dhis2.common.components.Dhis2TextButton
import org.dhis2.common.models.ButtonUiModel

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }
    val platformName = getPlatformName()

    Dhis2TextButton(
        model = ButtonUiModel(
            text = text,
            onClick = {
                text = "Hello, $platformName"
            }
        ),
        leadingIcon = {
            Icon(imageVector = Icons.Default.Add, contentDescription = "")
        }
    )
}
