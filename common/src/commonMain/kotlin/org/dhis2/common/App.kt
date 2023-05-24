package org.dhis2.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.dhis2.common.components.Components
import org.dhis2.common.screens.ButtonScreen

@Composable
fun App() {
    var screen by remember { mutableStateOf(Components.HOME) }
    loadScreen(screen)
}

@Composable
fun loadScreen(screen: Components) {
    return when (screen) {
        Components.BUTTON -> ButtonScreen()
        else -> HomeScreen()
    }
}

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.padding(10.dp)) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            content = { Text(text = "Buttons") },
            onClick = {

            },
        )
    }
}
