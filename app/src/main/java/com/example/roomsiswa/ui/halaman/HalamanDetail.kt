package com.example.roomsiswa.ui.halaman

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.roomsiswa.R
import com.example.roomsiswa.data.Siswa
import com.example.roomsiswa.model.ItemDetailUiState
import com.example.roomsiswa.navigasi.DestinasiNavigasi

object DetailsDestination : DestinasiNavigasi {
    override val route = "item_details"
    override val titleRes = R.string.detail_siswa
    const val siswaIdArg = "itemId"
    val routeWithArgs = "$route/{$siswaIdArg}"
}

@Composable
private fun ItemDetailsBody(
    itemDetailUiState: ItemDetailUiState,
    onDelete: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding()
    )
}
@Composable
fun ItemDetails(
    siswa: Siswa, modifier: Modifier = Modifier
){
    Card(
        modifier = modifier, colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.padding_medium)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_medium))
        ){
            ItemDetailsRow(
                labelResID = R.string.nama,
                itemDetail = siswa.nama,
                modifier = Modifier.padding(
                    horizontal = dimensionResource(id = 16dp)
                ))
            ItemDetailsRow(
                labelResID = "Alamat Siswa",
                itemDetail = siswa.alamat,
                modifier = Modifier.padding(
                    horizontal = dimensionResource(id = 16dp)
                ))
            ItemDetailsRow(
                labelResID = "Telpon Siswa",
                itemDetail = siswa.telpon,
                modifier = Modifier.padding(
                    horizontal = dimensionResource(id = 16dp)
                ))
        }
    }
}

@Composable
private fun ItemDetailsRow(
    @StringRes labelResID: Int,itemDetail: String, modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        Text(text = stringResource(labelResID))
        Spacer(modifier = Modifier.weight(1f))
        Text(text = itemDetail, fontWeight = FontWeight.Bold)
    }
}

@Composable
private fun DeleteConfirmationDialog(
    onDeleteConfirm: () -> Unit, onDeleteCancel: () -> Unit, modifier: Modifier = Modifier
) {
    AlertDialog(onDismissRequest = { /*TODO*/ },
        title = { Text(stringResource(R.string.attention))},
        text = { Text(stringResource(R.string.delete))},
        modifier = modifier,
        dismissButton = {
                        TextButton(onClick = onDeleteCancel){ 
                            Text(text = stringResource(R.string.no))
                        }
                    },
        confirmButton = { 
            TextButton(onClick = onDeleteConfirm) {
                Text(text = stringResource(R.string.yes))
            }
        })
}