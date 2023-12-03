package com.example.roomsiswa.navigasi

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun SiswaApp(navController: NavHostController= rememberNavController()){
    HostNavigasi(navController = navController)
}