package com.example.android.ui.base

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BaseSlider(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    Slider(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.fillMaxWidth()
    )
}

@Preview
@Composable
fun SliderPreview() {
    var sliderValue by remember { mutableStateOf(0.5f) }
    BaseSlider(value = sliderValue, onValueChange = { sliderValue = it })
}
