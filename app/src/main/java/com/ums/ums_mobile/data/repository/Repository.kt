package com.ums.ums_mobile.data.repository

import com.ums.ums_mobile.data.model.UserDao

class Repository (
    private val dao: UserDao
){

    suspend fun fetchUsers(){
        dao.fetchAllUsers()
    }
    suspend fun addUser(){
        dao.insertUser()
    }

}