package com.fidloo.mysoothe.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryButton(onClick: () -> Unit, text: String) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(72.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.primary,
            contentColor = MaterialTheme.colors.onPrimary
        ),
        shape = MaterialTheme.shapes.medium,
    ) {
        Text(text.toUpperCase())
    }
}