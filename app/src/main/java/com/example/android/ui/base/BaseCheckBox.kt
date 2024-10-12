package com.example.android.ui.base

import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp

@Composable
fun BaseCheckbox(
    label: String,
    modifier: Modifier = Modifier
) {
    var checked by remember { mutableStateOf(false) }

    Row(modifier = modifier.padding(8.dp)) {
        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it }
        )
        Text(text = label, modifier = Modifier.padding(start = 8.dp))
    }
}

@Preview
@Composable
fun CheckboxPreview() {
    BaseCheckbox(label = "Agree to terms")
}
