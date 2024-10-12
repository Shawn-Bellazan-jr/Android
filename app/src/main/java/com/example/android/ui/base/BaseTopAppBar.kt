package com.example.android.ui.base

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar(
    title: String,
    onActionClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(text = title) },
        modifier = modifier.fillMaxWidth(),
        actions = {
            IconButton(onClick = onActionClick) {
                Icon(Icons.Default.MoreVert, contentDescription = "Action")
            }
        }
    )
}

@Preview
@Composable
fun CustomTopAppBarPreview() {
    CustomTopAppBar(title = "My App", onActionClick = {})
}
