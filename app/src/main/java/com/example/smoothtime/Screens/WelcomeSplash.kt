package com.example.smoothtime.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.provider.FontsContractCompat.Columns
import androidx.navigation.NavController
import com.example.smoothtime.NavHost.NavigationItem
import com.example.smoothtime.R


@Composable
fun WelcomeSplash(
    modifier: Modifier = Modifier,
        navController: NavController

) {
    var clicked by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.background(colorResource(id = R.color.meditation_light_green)).fillMaxSize()
            .padding(16.dp),

        verticalArrangement =  Arrangement.Center
        , horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(

            text = "Welcome to  SmoothTime",
            color = colorResource(id = R.color.meditation_text_gray),
            modifier = Modifier.padding(4.dp),
            style = MaterialTheme.typography.headlineMedium,

        )

        Spacer(modifier = Modifier.padding(8.dp))

        Image(
            painter = painterResource(id = R.drawable.image3),
            contentDescription = "Welcome Splash",

            modifier = Modifier.size(350.dp)
        )
        Spacer(modifier = Modifier.padding(16.dp))

        Button(
            onClick = { /* Handle button click */
            clicked = !clicked
                navController.navigate(NavigationItem.RegisterScreen.route)


            },
            modifier = Modifier.fillMaxWidth().padding(16.dp).size(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = if (clicked) {
                    colorResource(id = R.color.meditation_main_green)
                } else {
                    colorResource(id = R.color.white)
                },
                contentColor = if (clicked) {
                    colorResource(id = R.color.white)
                } else {
                    colorResource(id = R.color.meditation_text_gray)
                }

            )
        ) {
          Text(
                text = "Get Started",

            )

        }




    }




    // This is a placeholder for the WelcomeSplash screen.
    // You can implement your welcome splash screen UI here.
    // For example, you might want to show a logo or a welcome message.

    // Example content:

}
