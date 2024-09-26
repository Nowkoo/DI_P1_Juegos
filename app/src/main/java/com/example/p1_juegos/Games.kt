package com.example.p1_juegos

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

data class Game(var nombre: String, var estaSeleccionada: Boolean = false, var foto: Int)

var juegos: List<Game> = listOf(
    Game("Angry Birds", foto = R.drawable.games_angrybirds),
    Game("Dragon Fly", foto = R.drawable.games_dragonfly),
    Game("Hill Climbing Racing", foto = R.drawable.games_hillclimbingracing),
    Game("Radiant Defense", foto = R.drawable.games_radiantdefense),
    Game("Pocket Soccer", foto = R.drawable.games_pocketsoccer),
    Game("Ninja Jump", foto = R.drawable.games_ninjump),
    Game("Air Control", foto = R.drawable.games_aircontrol),
    )

@Composable
fun Games() {


    Box() {

        Column(
           Modifier.align(Alignment.TopStart)
        ) {
            Spacer(modifier = Modifier.size(60.dp))

            CheckboxesConFoto(
                //Se almacenan todos los juegos y se marca y desmarca el booleano
                onCheckedChange = { nombre, selected ->
                for (juego in juegos) {
                    if (juego.nombre == nombre) {
                        juego.estaSeleccionada = selected
                    }
                }
            }
            )

        }
    }
}

//fun nombreImagen(nombreJuego: String): String {
//    return "games_" + nombreJuego.trim(' ').toLowerCase()
//
//}

@Composable
fun CheckboxesConFoto(onCheckedChange: (String, Boolean) -> Unit) {
    for (juego in juegos) {
        var selected by remember { mutableStateOf(false) }

        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(juego.foto),
                contentDescription = juego.nombre,
                modifier = Modifier.size(100.dp)
            )

            Checkbox(
                checked = !selected,
                onCheckedChange = { onCheckedChange(juego.nombre, selected)

//                    Alternativa? (se añaden los juegos seleccionados se borran los que no, no necesitaría almacenar el booleano)
//                    if (selected) {
//                        var newJuego = Game(nombre, selected, 1)
//                        juegos += newJuego
//                    } else {
//                        for (juego in juegos) {
//                            if (juego.nombre.equals(nombre))
//                                juegos -= juego
//                        }
//                    }
                }
            )

            Text(
                text = juego.nombre
            )
        }
    }
}