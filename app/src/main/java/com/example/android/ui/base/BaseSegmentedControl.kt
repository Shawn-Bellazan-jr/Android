package com.example.android.ui.base

import androidx.compose.ui.Alignment


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BaseSegmentedControl(
    options: List<String>,
    selectedOption: String,
    onOptionSelected: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(4.dp)
    ) {
        options.forEach { option ->
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clickable { onOptionSelected(option) }
                    .padding(4.dp)
                    .background(
                        if (option == selectedOption) MaterialTheme.colorScheme.primary
                        else MaterialTheme.colorScheme.surface
                    )
                    .padding(vertical = 8.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = option, color = if (option == selectedOption) Color.White else Color.Black)
            }
        }
    }
}

@Preview
@Composable
fun SegmentedControlPreview() {
    var selected by remember { mutableStateOf("Option 1") }
    BaseSegmentedControl(
        options = listOf("Option 1", "Option 2", "Option 3"),
        selectedOption = selected,
        onOptionSelected = { selected = it }
    )
}
