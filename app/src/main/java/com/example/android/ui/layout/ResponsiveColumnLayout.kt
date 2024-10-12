package com.example.android.ui.layout

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ResponsiveColumnLayout(items: List<String>, modifier: Modifier = Modifier) {
    val screenWidthDp = LocalConfiguration.current.screenWidthDp
    val columns = if (screenWidthDp > 600) 2 else 1 // Adjust column count based on screen width

    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(items.size / columns) { rowIndex ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                for (columnIndex in 0 until columns) {
                    if (rowIndex * columns + columnIndex < items.size) {
                        Text(
                            text = items[rowIndex * columns + columnIndex],
                            modifier = Modifier.weight(1f).padding(8.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun ResponsiveColumnLayoutPreview() {
    ResponsiveColumnLayout(
        items = listOf("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6")
    )
}