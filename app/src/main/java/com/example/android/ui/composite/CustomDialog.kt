package com.example.android.ui.composite

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android.ui.theme.AppTypography

@Composable
fun CustomDialog(
    title: String,
    content: String,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(text = title, style = AppTypography.headlineMedium)
        },
        text = {
            Text(text = content, style = AppTypography.bodyLarge)
        },
        confirmButton = {
            TextButton(onClick = onConfirm) {
                Text("Confirm", style = AppTypography.bodyLarge)
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Dismiss", style = AppTypography.bodyLarge)
            }
        }
    )
}

@Preview(showBackground = false)
@Composable
fun CustomDialogPreview() {
    CustomDialog(
        title = "Delete Item",
        content = "Are you sure you want to delete this item?",
        onDismiss = {},
        onConfirm = {}
    )
}