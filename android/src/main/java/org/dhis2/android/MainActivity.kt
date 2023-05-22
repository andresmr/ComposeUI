package org.dhis2.android

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {

    companion object {
        const val QUERY_COMPONENT = "component"

        const val BUTTON = "button"
        const val FLOATING_BUTTON = "floatingButton"
        const val CARD = "card"
        const val CHIPS = "chips"
        const val DIALOGS = "dialogs"
        const val RADIO = "radio"
        const val SWITCH = "switch"
        const val SLIDER = "slider"
        const val SNACKBAR = "snackbar"
        const val TABS = "tabs"
        const val TEXTFIELD = "textfield"
    }

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.padding(10.dp)) {
                Button(
                    content = { Text(text = "Buttons") },
                    onClick = {
                        handleIntent(BUTTON)
                    },
                )

            }
        }
        intent.data?.getQueryParameter(QUERY_COMPONENT)?.let {
            handleIntent(it)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        if (intent != null) {
            setIntent(intent)
            intent.data?.getQueryParameter(QUERY_COMPONENT)?.let {
                handleIntent(it)
            }
        }
    }

    private fun handleIntent(component: String) {

        val buttonIntent = Intent(this, ButtonActivity::class.java).apply {
            putExtra(BUTTON, "button")
            propagateQueryParams(intent, this)
        }

        /*val floatingButtonIntent = Intent(this, FloatingButtonActivity::class.java).apply {
            putExtra(FLOATING_BUTTON, "floatingButton")
            propagateQueryParams(intent, this)
        }
        val cardIntent = Intent(this, CardActivity::class.java).apply {
            putExtra(CARD, "card")
            propagateQueryParams(intent, this)
        }

        val chipsIntent = Intent(this, ChipsActivity::class.java).apply {
            putExtra(CHIPS, "chips")
            propagateQueryParams(intent, this)
        }

        val dialogsIntent = Intent(this, DialogsActivity::class.java).apply {
            putExtra(DIALOGS, "dialogs")
            propagateQueryParams(intent, this)
        }

        val radioIntent = Intent(this, RadioActivity::class.java).apply {
            putExtra(RADIO, "radio")
            propagateQueryParams(intent, this)
        }

        val switchIntent = Intent(this, SwitchActivity::class.java).apply {
            putExtra(SWITCH, "switch")
            propagateQueryParams(intent, this)
        }

        val sliderIntent = Intent(this, SliderActivity::class.java).apply {
            putExtra(SLIDER, "slider")
            propagateQueryParams(intent, this)
        }

        val snackbarIntent = Intent(this, SnackbarActivity::class.java).apply {
            putExtra(SNACKBAR, "snackbar")
            propagateQueryParams(intent, this)
        }

        val tabsIntent = Intent(this, TabsActivity::class.java).apply {
            putExtra(TABS, "tabs")
            propagateQueryParams(intent, this)
        }

        val textFieldIntent = Intent(this, TextFieldActivity::class.java).apply {
            putExtra(TEXTFIELD, "textfield")
            propagateQueryParams(intent, this)
        }*/

        when (component) {
            BUTTON -> startActivity(buttonIntent)
        }
    }

    private fun propagateQueryParams(openIntent: Intent, viewIntent: Intent) {
        if (openIntent.data != null) {
            for (param in openIntent.data!!.queryParameterNames) {
                viewIntent.putExtra(param, openIntent.data!!.getQueryParameter(param));
            }
        }
    }
}
