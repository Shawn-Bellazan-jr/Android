package com.example.android.ui.composite


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android.ui.base.BaseButton
import com.example.android.ui.base.BaseText

@Composable
fun ProfileCard(
    modifier: Modifier = Modifier,
    name: String,
    onFollowClick: () -> Unit
) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.surface),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BaseText(
            text = name,
            modifier = Modifier.padding(bottom = 8.dp),
            color = MaterialTheme.colorScheme.primary
        )
        BaseButton(text = "Follow", onClick = onFollowClick)
    }
}

@Preview
@Composable
fun ProfileCardPreview() {
    ProfileCard(name = "John Doe", onFollowClick = {})
}