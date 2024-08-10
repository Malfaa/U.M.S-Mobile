package com.usm.usm_mobile.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User (
    @PrimaryKey
    val matricula: Long,
    var name: String,
    var email: String
)