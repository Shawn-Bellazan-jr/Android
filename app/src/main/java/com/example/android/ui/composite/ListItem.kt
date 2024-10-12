package com.example.android.ui.composite


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android.ui.base.BaseText

@Composable
fun ListItem(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.surface)
    ) {
        BaseText(text = title, color = MaterialTheme.colorScheme.primary)
        Spacer(modifier = Modifier.height(4.dp))
        BaseText(text = subtitle, color = MaterialTheme.colorScheme.secondary)
    }
}

@Preview
@Composable
fun ListItemPreview() {
    ListItem(title = "Item Title", subtitle = "Item Subtitle")
}