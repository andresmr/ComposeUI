package org.dhis2.common.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.dhis2.common.models.ButtonUiModel

@Composable
fun Dhis2TextButton(
    modifier: Modifier = Modifier,
    model: ButtonUiModel,
    leadingIcon: @Composable (() -> Unit)? = null
) {
    TextButton(
        modifier = modifier,
        onClick = model.onClick,
        enabled = model.enabled
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

/*
@Preview
@Composable
fun Dhis2TextButtonPreview() {
    Dhis2TextButton(
        model = ButtonUiModel(
            text = "Action"
        ) {},
        leadingIcon = {
            Icon(imageVector = Icons.Default.Add, contentDescription = "")
        }
    )
}*/
