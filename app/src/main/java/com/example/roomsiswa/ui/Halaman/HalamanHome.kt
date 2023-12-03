package com.example.roomsiswa.ui.Halaman

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.roomsiswa.navigasi.DestinasiNavigasi
import com.example.roomsiswa.R
import com.example.roomsiswa.model.HomeViewModel
import com.example.roomsiswa.model.PenyediaViewModel

object DestinasiHome : DestinasiNavigasi{
    override val route = "home"
    override val titleRes = R.string.app_name
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navigateToItemEntry: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(factory = PenyediaViewModel.Factory)
){
}