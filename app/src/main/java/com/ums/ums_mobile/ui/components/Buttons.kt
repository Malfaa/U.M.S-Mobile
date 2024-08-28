package com.ums.ums_mobile.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import com.ums.ums_mobile.ui.theme.BorderColor
import com.ums.ums_mobile.ui.theme.ButtonBG
import com.usm.usm_mobile.R
import androidx.navigation.NavHostController

@Composable
fun MainButtons(nav: String, buttonText:String, navController: NavHostController){
    Button(
        onClick = { navController.navigate(nav) },
        colors = ButtonColors(ButtonBG, ButtonBG, ButtonBG, ButtonBG),
        shape = RoundedCornerShape(size = 30.dp),
        modifier = Modifier
            .border(
                width = 1.dp,
                color = BorderColor,
                shape = RoundedCornerShape(size = 30.dp)
            )
            .width(260.dp)
            .height(55.dp)
            .background(color = ButtonBG, shape = RoundedCornerShape(size = 30.dp))
            .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 10.dp)
    ){
        Text(
            text = stringResource(id = "R.string.$buttonText".toInt()),
            style = TextStyle(
                fontSize = 20.sp,
//                fontFamily = FontFamily(Font(R.font.lato)),
//                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            )
        )
    }
}

@Composable
fun AddButton(navController: NavHostController, nav: String){ //TODO criar AddScreen
    Button(onClick = {navController.navigate(nav)},
    ) {
        Icon(painter = painterResource(id = R.drawable.adicionar_bttn),
            contentDescription =  stringResource( R.string.add_btn_descrip),
            modifier = Modifier
                .padding(1.dp)
                .width(40.dp)
                .height(40.dp))
    }
}

@Composable
fun RemoveButton(buttonText:String){
    Button(onClick = {
        //TODO Colocar para apagar do Realtime Database e dar Fetch direto de lá salvando no BD local
    }) {
        Icon(painter = painterResource(id = R.drawable.delete_bttn), contentDescription =  stringResource(id = "R.string.$buttonText".toInt()))
    }
}

@Composable
fun RefreshButton(buttonText:String, /*viewModel: ViewModel*/){
    Button(onClick = {
        //TODO abrir o viewmodel, vai pegar do Firebase, se tiver coisa nova, vai atualizar o bd e em seguida irá usar a função de dar SELECT, atualizando assim a lista
    }) {
        Icon(painter = painterResource(id = R.drawable.refresh_button), contentDescription =  stringResource(id = "R.string.$buttonText".toInt()))
    }
}

@Composable
fun ConfigButton(){// esse é do item
    Button(
        onClick = {
            //ConfigurationAlert()
        }
    ) {
        Icon(
            painter = painterResource(id = R.drawable.config_button),
            contentDescription =  stringResource(R.string.config_btn_descrip)
        )
    }
}

@Composable
fun CheckButton(){
    Button(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = R.drawable.check_bttn), contentDescription =  stringResource(R.string.check_btn_descrip))
    }
}

@Composable
fun CancelButton(){
    Button(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = R.drawable.cancel_bttn), contentDescription =  stringResource(R.string.cancel_btn_descrip))
    }
}

@Composable
fun SearchButton(viewModel: ViewModel){
    Button(onClick = {

    }) {
        Icon(painter = painterResource(id = R.drawable.search_bttn), contentDescription =  stringResource(R.string.search_btn_descrip))
    }
}