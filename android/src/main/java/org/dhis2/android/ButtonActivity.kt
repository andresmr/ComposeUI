package org.dhis2.android

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.dhis2.common.components.Dhis2TextButtonPreview
import org.dhis2.common.components.SimpleButtonPreview

class ButtonActivity : AppCompatActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold {
                var text by rememberSaveable { mutableStateOf("Button text") }

                intent.getStringExtra("label")?.let {
                    text = it
                }

                Column(modifier = Modifier.padding(10.dp)) {
                    Button(
                        content = { Text(text = text) },
                        onClick = {},
                    )

                    Dhis2TextButtonPreview()
                    SimpleButtonPreview()
                }
            }
        }
    }
}