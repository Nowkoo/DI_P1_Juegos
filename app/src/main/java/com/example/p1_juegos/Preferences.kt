package com.example.p1_juegos

import android.content.Context
import android.graphics.fonts.FontStyle
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Preferences(modifier: Modifier = Modifier) {
    var sliderPosition by remember { mutableFloatStateOf(0f) }
    val radioOptions = listOf("Teamfight Tactics", "Project Zomboid", "Twilight Struggle", "Civilizations VII")
    var selectedOption by remember { mutableStateOf<String?>(null) }
    val context = LocalContext.current

    Box(
        modifier.fillMaxSize()
    ) {
        Column(modifier.align(Alignment.TopCenter))  {
            Spacer(modifier = Modifier.size(60.dp))
            Text(
                text = "Elige una opción:",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Column(
            Modifier
                .selectableGroup()
                .align(Alignment.TopStart)
                .padding(16.dp)
        ) {
            Spacer(
                modifier = Modifier.size(100.dp)
            )

            RadioButtons(
                radioOptions,
                selectedOption.toString(),
                onOptionSelected = { selectedOption = it }
            )

            SliderWithLabel(
                sliderPosition,
                onValueChange = { sliderPosition = it }
            )
        }

        FloatingActionButton(
            onClick = {
                toastMessage(selectedOption, sliderPosition, context)
            },
            modifier
                .align(Alignment.BottomEnd)
                .padding(20.dp),
            containerColor = MaterialTheme.colorScheme.tertiary
        ) {
            Icon(Icons.Filled.Add, "Floating action button.")
        }

    }
}

private fun toastMessage(
    selectedOption: String?,
    sliderPosition: Float,
    context: Context
) {
    val message = if (selectedOption == null) {
        "No has pulsado ninguna opción"
    } else {
        "Has seleccionado $selectedOption con una puntuación de $sliderPosition"
    }
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

@Composable
private fun RadioButtons(
    radioOptions: List<String>,
    selectedOption: String,
    onOptionSelected: (String) -> Unit
) {
    radioOptions.forEach { text ->
        Row(
            Modifier
                .fillMaxWidth()
                .height(56.dp)
                .selectable(
                    selected = (text == selectedOption),
                    onClick = { onOptionSelected(text) },
                    role = Role.RadioButton
                )
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = (text == selectedOption),
                onClick = null
            )
            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 16.dp)
            )
        }
    }
}

@Composable
private fun SliderWithLabel(
    sliderPosition: Float,
    onValueChange: (Float) -> Unit
) {
    Column() {
        Slider(
            value = sliderPosition,
            onValueChange = onValueChange,
            steps = 9,
            valueRange = 0f..10f
        )
        Text(text = sliderPosition.toString())
    }
}