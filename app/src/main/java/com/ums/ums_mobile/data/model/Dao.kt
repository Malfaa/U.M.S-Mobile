package com.ums.ums_mobile.data.model

import androidx.room.Dao
import androidx.room.Query

@Dao
interface Dao {
    @Query("SELECT * FROM ")
    suspend fun getAllUsers():List<User>


}