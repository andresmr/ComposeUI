package org.dhis2.android.previews

import androidx.compose.runtime.Composable
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import org.dhis2.common.components.SimpleButtonPreview
import org.dhis2.common.components.Dhis2TextButtonPreview

@ShowkaseComposable(name = "Dhis2TextButton", group = "Buttons")
@Composable
fun TextButtonPreview() {
    Dhis2TextButtonPreview()
}

@ShowkaseComposable(name = "Simple Button", group = "Buttons")
@Composable
fun ButtonPReview() {
    SimpleButtonPreview()
}