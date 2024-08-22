package com.ums.ums_mobile.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.material3.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ums.ums_mobile.ui.theme.BorderColor
import com.ums.ums_mobile.ui.theme.TextFieldBG

@Composable
fun TextField(){
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { mutableSetOf("") } ,
        modifier = Modifier
            .border(width = 1.dp, color = BorderColor, shape = RoundedCornerShape(size = 12.dp))
            .width(320.dp)
            .height(60.dp)
            .background(color = TextFieldBG, shape = RoundedCornerShape(size = 12.dp))
            .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 10.dp)
    )

//    var text by remember { mutableStateOf("") }
//
//    OutlinedTextField(
//        value = text,
//        onValueChange = { text = it },
//        label = { Text("Label") }
//    )

}