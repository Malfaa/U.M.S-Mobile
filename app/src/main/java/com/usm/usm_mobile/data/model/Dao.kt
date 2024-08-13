package com.usm.usm_mobile.data.model

import androidx.room.Dao
import androidx.room.Query

@Dao
public interface Dao {
    @Query("SELECT * FROM ")
    suspend fun getAllUsers():List<User>


}