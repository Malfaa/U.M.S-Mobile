package com.ums.ums_mobile.data.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.StateFlow

@Dao
interface UserDao {
    @Query("SELECT * FROM USER_DATABASE")
    fun fetchAllUsers():List<StateFlow<User>>

    @Query("SELECT name FROM USER_DATABASE")
    fun fetchSpecificUser(user: User):StateFlow<User>

    @Insert
    suspend fun insertUser(user: User)

    @Update
    suspend fun editUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)

}