import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.dhis2.common.App


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
