package com.example.android.ui.base

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ToggleSwitch(isChecked: Boolean, onCheckedChange: (Boolean) -> Unit) {
    Switch(
        checked = isChecked,
        onCheckedChange = onCheckedChange,
        modifier = Modifier.padding(16.dp)
    )
}

@Preview
@Composable
fun ToggleSwitchPreview() {
    var checked by remember { mutableStateOf(true) }
    ToggleSwitch(isChecked = checked, onCheckedChange = { checked = it })
}
