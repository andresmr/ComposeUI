package org.dhis2.common.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.dhis2.common.components.Components

@Composable
fun HomeScreen(onButtonClick: (Components) -> Unit) {
    Column(modifier = Modifier.padding(10.dp)) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            content = { Text(text = "Buttons") },
            onClick = {
                onButtonClick(Components.BUTTON)
            },
        )
    }
}