package com.ums.ums_mobile.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.usm.usm_mobile.R

@Composable
fun addButton(){
    Button(onClick = {},
        modifier = Modifier
    ) {
        Icon(painter = painterResource(id = R.drawable.adicionar_button), contentDescription =  stringResource( R.string.add_btn_descrip))
    }
}

@Composable
fun removeButton(){
    Button(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = R.drawable.delete_bttn), contentDescription =  stringResource(R.string.rmv_btn_descrip))
    }
}

@Composable
fun refreshButton(){
    Button(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = R.drawable.refresh_button), contentDescription =  stringResource(R.string.refresh_btn_descrip))
    }
}

@Composable
fun configButton(){
    Button(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = R.drawable.config_button), contentDescription =  stringResource(R.string.config_btn_descrip))
    }
}

@Composable
fun checkButton(){
    Button(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = R.drawable.check_bttn), contentDescription =  stringResource(R.string.check_btn_descrip))
    }
}

@Composable
fun cancelButton(){
    Button(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = R.drawable.cancel_bttn), contentDescription =  stringResource(R.string.cancel_btn_descrip))
    }
}

@Composable
fun searchButton(){
    Button(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = R.drawable.search_bttn), contentDescription =  stringResource(R.string.search_btn_descrip))
    }
}