package previews

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import org.dhis2.common.components.Dhis2TextButtonPreview
import org.dhis2.common.components.SimpleButtonPreview

@Preview
@Composable
fun TextButtonPreview() {
    Dhis2TextButtonPreview()
}

@Preview
@Composable
fun ButtonPReview() {
    SimpleButtonPreview()
}