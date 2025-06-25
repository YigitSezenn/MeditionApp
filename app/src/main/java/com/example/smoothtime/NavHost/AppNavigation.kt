package com.example.smoothtime.NavHost

enum class AppNavigation()
{
    WelcomeSplash,
    SplashScreen,
    RegisterScreen,


}
sealed class
NavigationItem(val route: String) {
    object WelcomeSplash : NavigationItem(AppNavigation.WelcomeSplash.name)
    object SplashScreen : NavigationItem(AppNavigation.SplashScreen.name)
    object RegisterScreen : NavigationItem(AppNavigation.RegisterScreen.name)

    // Add more screens as needed
}