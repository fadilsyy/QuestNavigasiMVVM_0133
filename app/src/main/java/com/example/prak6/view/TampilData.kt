package com.example.prak6.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.prak6.R
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api:class)
@Composable
fun TampilData(
    onBackBtnClick:()->Unit
){
    val items = listOf(
        Pair(stringResource(R.string.nama_lengkap),"Contoh Nama"),
        Pair(stringResource(R.string.jenis_kelamin),"Lainnya"),
        Pair(stringResource(R.string.alamat),"Yogyakarta")
    )
    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = {Text(stringResource(id=R.string.home),color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    colorResource(id = R.color.teal_700))
            )
        }){ isiRuang->

    }
}