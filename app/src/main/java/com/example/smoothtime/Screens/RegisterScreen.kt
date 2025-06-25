package com.example.smoothtime.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.smoothtime.R

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var FirstName by remember { mutableStateOf("") }
    var LastName by remember { mutableStateOf("") }
    var Email by remember { mutableStateOf("") }
    var Password by remember { mutableStateOf("") }
    var ConfirmPassword by remember { mutableStateOf("") }
    var Age by remember { mutableStateOf("") }
    var clicked by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.fillMaxSize(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.meditation_light_green)
            )
        ) {
            Image(
                painter = painterResource(id = R.drawable.image1),
                contentDescription = "Register Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(2f) // Genişlik, yüksekliğin 2 katı olacak şekilde öğeyi boyutlandır.
            )

            Text(
                text = "Kendin İçin Bir Şey Yap ✨\nBu kayıt, zihinsel sağlığın için atacağın en güzel adım olabilir.",

                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )

            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                TextField(
                    value = FirstName,
                    onValueChange = { FirstName = it },
                    label = { Text("First Name")
                           },
                    maxLines = 1,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = colorResource(id = R.color.meditation_main_green), // Odak çizgisi
                        unfocusedIndicatorColor = colorResource(id = R.color.meditation_text_gray), // Odak dışı çizgi
                        focusedContainerColor = colorResource(id = R.color.meditation_light_green), // Odaklı arka plan
                        unfocusedContainerColor = colorResource(id = R.color.meditation_background),  // Odak dışı arka plan
                        cursorColor = colorResource(id = R.color.meditation_main_green), // İmleç rengi
                        errorIndicatorColor = colorResource(id = android.R.color.holo_red_dark), // Hata durumu çizgisi
                    )
                )
                TextField(
                    value = LastName,
                    onValueChange = { LastName = it },
                    label = { Text("Last Name")},
                    maxLines = 1,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = colorResource(id = R.color.meditation_main_green), // Odak çizgisi
                        unfocusedIndicatorColor = colorResource(id = R.color.meditation_text_gray), // Odak dışı çizgi
                        focusedContainerColor = colorResource(id = R.color.meditation_light_green), // Odaklı arka plan
                        unfocusedContainerColor = colorResource(id = R.color.meditation_background),  // Odak dışı arka plan
                        cursorColor = colorResource(id = R.color.meditation_main_green), // İmleç rengi
                        errorIndicatorColor = colorResource(id = android.R.color.holo_red_dark), // Hata durumu çizgisi
                )
                )
                TextField(
                    value = Email,
                    onValueChange = { Email = it },
                    label = { Text("Email") },
                    maxLines = 1,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp) ,
                            colors = TextFieldDefaults.colors(
                            focusedIndicatorColor = colorResource(id = R.color.meditation_main_green), // Odak çizgisi
                    unfocusedIndicatorColor = colorResource(id = R.color.meditation_text_gray), // Odak dışı çizgi
                    focusedContainerColor = colorResource(id = R.color.meditation_light_green), // Odaklı arka plan
                    unfocusedContainerColor = colorResource(id = R.color.meditation_background),  // Odak dışı arka plan
                    cursorColor = colorResource(id = R.color.meditation_main_green), // İmleç rengi
                    errorIndicatorColor = colorResource(id = android.R.color.holo_red_dark), // Hata durumu çizgisi
                            )
                )
                TextField(
                    value = Password,
                    onValueChange = { Password = it },
                    label = { Text("Password") },
                    maxLines = 1,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = colorResource(id = R.color.meditation_main_green), // Odak çizgisi
                        unfocusedIndicatorColor = colorResource(id = R.color.meditation_text_gray), // Odak dışı çizgi
                        focusedContainerColor = colorResource(id = R.color.meditation_light_green), // Odaklı arka plan
                        unfocusedContainerColor = colorResource(id = R.color.meditation_background),  // Odak dışı arka plan
                        cursorColor = colorResource(id = R.color.meditation_main_green), // İmleç rengi
                        errorIndicatorColor = colorResource(id = android.R.color.holo_red_dark), // Hata durumu çizgisi
                    )
                    )
                TextField(
                    value = ConfirmPassword,
                    onValueChange = { ConfirmPassword = it },
                    label = { Text("Confirm Password") },
                    maxLines = 1,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),

                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = colorResource(id = R.color.meditation_main_green), // Odak çizgisi
                        unfocusedIndicatorColor = colorResource(id = R.color.meditation_text_gray), // Odak dışı çizgi
                        focusedContainerColor = colorResource(id = R.color.meditation_light_green), // Odaklı arka plan
                        unfocusedContainerColor = colorResource(id = R.color.meditation_background),  // Odak dışı arka plan
                        cursorColor = colorResource(id = R.color.meditation_main_green), // İmleç rengi
                        errorIndicatorColor = colorResource(id = android.R.color.holo_red_dark), // Hata durumu çizgisi

                    )
                    )
                Button(
                    onClick = {
                        clicked = !clicked
                        // Handle registration logic here
                        // For now, just navigate back to the welcome screen
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp).size(50.dp),
                    colors= ButtonDefaults.buttonColors(
                        containerColor =  if(clicked)
                        {
                            colorResource(id = R.color.white)
                        } else {
                            colorResource(id = R.color.meditation_main_green)
                        },
                        contentColor = if (clicked) {
                            colorResource(id = R.color.meditation_main_green)
                        } else {
                            colorResource(id = R.color.white)
                        }

                    )
                ) {
                    Text(text = "Register")
                }


            }

        }
    }
}
