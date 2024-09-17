package com.example.p1_juegos

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun NewPlayer(modifier: Modifier = Modifier) {
    var peso1 = 0.5f
    var peso2 = 1.5f

    Column (
//        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
            .padding(10.dp)
            .verticalScroll(rememberScrollState()),
    ) {
        Spacer(
            modifier = Modifier.size(30.dp)
        )

        Row (
            verticalAlignment = Alignment.CenterVertically,

        ) {
            Image(
                painter = painterResource(R.drawable.account),
                contentDescription = "User",
                modifier = Modifier.size(80.dp)
                    .weight(peso1)
            )

            var nombre by rememberSaveable() { mutableStateOf("") }

            TextField(
                value = nombre,
                onValueChange = {nombre = it},
                label = {Text("Nombre")},
                singleLine = true,
                modifier = Modifier.weight(peso2)
            )
        }

        Row (
            verticalAlignment = Alignment.CenterVertically,
        ) {
            var apellido by rememberSaveable() { mutableStateOf("") }

            Spacer(
                modifier = Modifier.size(80.dp)
                    .weight(peso1)
            )

            TextField(
                value = apellido,
                onValueChange = {apellido = it},
                label = {Text("Apellido")},
                singleLine = true,
                modifier = Modifier.weight(peso2)
            )
        }

        Row (
            verticalAlignment = Alignment.CenterVertically,
        ) {
            var nickname by rememberSaveable() { mutableStateOf("") }

            Spacer(
                modifier = Modifier.size(80.dp)
                    .weight(peso1)
            )

            TextField(
                value = nickname,
                onValueChange = {nickname = it},
                label = {Text("Nickname")},
                singleLine = true,
                modifier = Modifier.weight(peso2)
            )
        }

        Row (
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Spacer(
                modifier = Modifier.weight(1f)
                    .weight(peso1)
            )

            Image(
                painter = painterResource(R.drawable.android),
                contentDescription = "Android",
                modifier = Modifier.size(130.dp)
                    .weight(2f)
            )

            Button(
//                contentPadding = PaddingValues(start = 6.dp),
                onClick = {},
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Change"
                )
            }
        }

        Row (
            verticalAlignment = Alignment.CenterVertically,

            ) {
            Image(
                painter = painterResource(R.drawable.camera),
                contentDescription = "User",
                modifier = Modifier.size(80.dp)
                    .weight(peso1)
            )

            var telefono by rememberSaveable() { mutableStateOf("") }

            TextField(
                value = telefono,
                onValueChange = {telefono = it},
                label = {Text("Teléfono")},
                singleLine = true,
                modifier = Modifier.weight(peso2)
            )
        }

        Row (
            verticalAlignment = Alignment.CenterVertically,

            ) {
            Image(
                painter = painterResource(R.drawable.email),
                contentDescription = "User",
                modifier = Modifier.size(80.dp)
                    .weight(peso1)
            )

            var email by rememberSaveable() { mutableStateOf("") }

            TextField(
                value = email,
                onValueChange = {email = it},
                label = {Text("Email")},
                singleLine = true,
                modifier = Modifier.weight(peso2)
            )
        }
    }
}