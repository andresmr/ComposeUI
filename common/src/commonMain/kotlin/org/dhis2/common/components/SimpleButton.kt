package org.dhis2.common.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.dhis2.common.models.ButtonUiModel

@Composable
fun Dhis2Button(
    modifier: Modifier = Modifier,
    model: ButtonUiModel,
    leadingIcon: @Composable (() -> Unit)? = null
) {
    Button(
        modifier = modifier,
        onClick = model.onClick
    ) {
        leadingIcon?.let {
            it.invoke()
            Spacer(modifier = Modifier.size(8.dp))
        }
        Text(
            text = model.text,
            fontSize = 12.sp
        )
    }
}

@Composable
fun SimpleButtonPreview() {
    Dhis2Button(
        model = ButtonUiModel(
            text = "Action"
        ) {},
        leadingIcon = {
            Icon(imageVector = Icons.Default.Add, contentDescription = "")
        }
    )
}