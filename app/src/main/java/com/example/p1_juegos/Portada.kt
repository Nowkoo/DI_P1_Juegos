package com.example.p1_juegos

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p1_juegos.ui.theme.Pink40

@Composable
fun Portada(modifier: Modifier = Modifier) {
    val configuracion = LocalConfiguration.current

    when (configuracion.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Play Juegos",
                    modifier = modifier,
                    fontSize = 40.sp,
                    fontStyle = FontStyle.Italic
                )

                Spacer(
                    modifier = Modifier.size(20.dp)
                )

                Row {
                    Column {
                        Button(
                            onClick = {},
                            modifier = modifier
                                .width(180.dp),
                            colors = ButtonDefaults.buttonColors(Pink40)
                        ) {
                            Text(
                                text = "Play",
                                fontSize = 15.sp
                            )
                        }

                        Button(
                            onClick = {},
                            modifier = modifier
                                .width(180.dp)
                        ) {
                            Text(
                                text = "New Player",
                                fontSize = 15.sp
                            )
                        }
                    }

                    Spacer(
                        modifier = Modifier.size(50.dp)
                    )

                    Column {
                        Button(
                            onClick = {},
                            modifier = modifier
                                .width(180.dp)
                        ) {
                            Text(
                                text = "Preferences",
                                fontSize = 15.sp
                            )
                        }

                        Button(
                            onClick = {},
                            modifier = modifier
                                .width(180.dp)
                        ) {
                            Text(
                                text = "About",
                                fontSize = 15.sp
                            )
                        }
                    }
                }
            }
        } else -> {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "Play Juegos",
                fontSize = 40.sp,
                fontStyle = FontStyle.Italic
            )

            Spacer(
                modifier = Modifier.size(20.dp)
            )

            Button(
                onClick = {},
                modifier = modifier
                    .width(180.dp),
                colors = ButtonDefaults.buttonColors(Pink40)
            ) {
                Text(
                    text = "Play",
                    fontSize = 15.sp
                )
            }

            Button(
                onClick = {},
                modifier = modifier
                    .width(180.dp)
            ) {
                Text(
                    text = "New Player",
                    fontSize = 15.sp
                )
            }

            Button(
                onClick = {},
                modifier = modifier
                    .width(180.dp)
            ) {
                Text(
                    text = "Preferences",
                    fontSize = 15.sp
                )
            }

            Button(
                onClick = {},
                modifier = modifier
                    .width(180.dp)
            ) {
                Text(
                    text = "About",
                    fontSize = 15.sp
                )
            }
        }
    }
    }

}