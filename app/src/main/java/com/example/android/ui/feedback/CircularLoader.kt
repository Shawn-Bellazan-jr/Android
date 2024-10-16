package com.example.android.ui.feedback

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CircularLoader(modifier: Modifier = Modifier) {
    CircularProgressIndicator(
        modifier = modifier
            .padding(16.dp)
            .size(48.dp)
    )
}

@Preview
@Composable
fun CircularLoaderPreview() {
    CircularLoader()
}
