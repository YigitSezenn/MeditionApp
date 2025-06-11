package com.example.smoothtime.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.provider.FontsContractCompat.Columns
import com.example.smoothtime.R

@Composable
fun WelcomeSplash(
    modifier: Modifier = Modifier

) {

    Column(
        modifier = Modifier.background(colorResource(id = R.color.meditation_light_green)).fillMaxSize()
            .padding(16.dp),

        verticalArrangement =  Arrangement.Center
        , horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.image2),
            contentDescription = "Welcome Splash",
            modifier = Modifier.fillMaxSize()
                .aspectRatio(1f)
        )
        Spacer(modifier = Modifier.padding(32.dp))


    }




    // This is a placeholder for the WelcomeSplash screen.
    // You can implement your welcome splash screen UI here.
    // For example, you might want to show a logo or a welcome message.

    // Example content:

}
   @Preview
@Composable
fun WelcomeSplashPreview() {
    WelcomeSplash()
}