package com.example.android.ui.base

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomToggleButton(
    text: String,
    modifier: Modifier = Modifier
) {
    var isSelected by remember { mutableStateOf(false) }

    Button(
        onClick = { isSelected = !isSelected },
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary
        ),
        modifier = modifier
    ) {
        Text(text = if (isSelected) "ON" else "OFF")
    }
}

@Preview
@Composable
fun ToggleButtonPreview() {
    CustomToggleButton(text = "Toggle")
}
