package com.example.smoothtime.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.smoothtime.NavHost.NavigationItem
import com.example.smoothtime.R


@Composable
fun SplashScreen(navController: NavController) {

    var clicked by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize().padding(8.dp).


        background(
            colorResource(id =R.color.meditation_light_green)




        // Replace with your desired color resource

        ),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer( modifier = Modifier.padding(32.dp))
        Card(
           modifier = Modifier.fillMaxWidth()
            .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.meditation_light_green) // daha açık tonlar iyidir
            ),
            elevation = CardDefaults.cardElevation(8.dp)



        ) {
            Text(
                text = "Zihnini sakinleştir, bedenini dinle.\n" +
                        "Huzurlu bir yaşam için ilk adımı at.",
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = colorResource(id = R.color.meditation_text_gray),
                style = MaterialTheme.typography.headlineSmall,


            )
            Image(
                painter = painterResource(id = R.drawable.image2),
                contentDescription = "Welcome Splash",
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            )

            Spacer( modifier = Modifier.padding(8.dp))


        }
        Column {

            Button(
                modifier = Modifier.fillMaxWidth().padding(16.dp).size(50.dp),
                colors = ButtonDefaults.buttonColors(
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


                ),
                onClick = {
                    clicked = !clicked // Toggle the clicked state

                    navController.navigate(NavigationItem.RegisterScreen.route)
                }
            ) {
                Text(
                    text = "Kayıt Ol",

                )

            }

        }




    }

    // This is a placeholder for the RegisterScreen composable.
    // You can implement your registration UI here.
    // For example, you might include text fields for username and password,
    // and a button to submit the registration form.
}