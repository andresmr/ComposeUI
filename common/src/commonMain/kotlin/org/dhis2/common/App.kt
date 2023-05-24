package org.dhis2.common

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import org.dhis2.common.components.Components
import org.dhis2.common.screens.ButtonScreen
import org.dhis2.common.screens.HomeScreen

@Composable
fun App() {
    val currentScreen = remember { mutableStateOf(Components.HOME)}

    MaterialTheme {
        when(currentScreen.value) {
            Components.BUTTON -> ButtonScreen()
            else -> HomeScreen { currentScreen.value = it }
        }
    }
}

