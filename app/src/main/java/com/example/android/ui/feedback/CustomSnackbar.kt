package com.example.android.ui.feedback

import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomSnackbar(
    message: String,
    actionLabel: String? = null,
    onActionClick: (() -> Unit)? = null
) {
    Snackbar(
        action = {
            actionLabel?.let {
                TextButton(onClick = { onActionClick?.invoke() }) {
                    Text(it)
                }
            }
        }
    ) { Text(message) }
}

@Preview
@Composable
fun CustomSnackbarPreview() {
    CustomSnackbar(
        message = "Item deleted",
        actionLabel = "UNDO",
        onActionClick = {}
    )
}
