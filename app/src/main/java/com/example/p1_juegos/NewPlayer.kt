package com.example.p1_juegos

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun NewPlayer(modifier: Modifier = Modifier) {
    Column (
      Modifier.fillMaxWidth()
    ) {
        Spacer(
            modifier = Modifier.size(30.dp)
        )

        Row {
            Image(
                painter = painterResource(R.drawable.account),
                contentDescription = "User",
                modifier = Modifier.size(80.dp)
            )

            //TextField(value = "Nombre", onValueChange = "")
        }
    }
}