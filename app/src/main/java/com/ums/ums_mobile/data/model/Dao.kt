package com.ums.ums_mobile.data.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.StateFlow

@Dao
interface Dao {
    @Query("SELECT * FROM USER_DATABASE")
    fun getAllUsers():List<StateFlow<User>>

    @Insert
    suspend fun insertUser(user: User)

    @Update
    suspend fun editUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)

}