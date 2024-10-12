package com.example.android.ui.composite

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun <T> ItemList(
    items: List<T>,
    padding: PaddingValues = PaddingValues(16.dp),
    content: @Composable (T) -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = padding
    ) {
        items(items) { item ->
            content(item)
        }
    }
}

@Composable
fun ItemList(items: List<String>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(items) { item ->
            Text(text = item, modifier = Modifier.padding(vertical = 8.dp))
        }
    }
}

@Preview
@Composable
fun ItemListPreview() {
    ItemList(listOf("Item 1", "Item 2", "Item 3"))
}
@Preview
@Composable
fun ItemList2Preview() {
    ItemList(listOf("Mile")) {
        ListItem(title = it, subtitle = "CEO")
    }
}
