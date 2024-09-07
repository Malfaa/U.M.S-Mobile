package com.ums.ums_mobile.data.repository

import com.ums.ums_mobile.data.firebase.APIService
import com.ums.ums_mobile.data.model.User
import com.ums.ums_mobile.data.model.UserDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

/*
class Repository (
    private val udb: UserDatabase,
    private val apiService: APIService
){

    // Função para obter dados do API
    suspend fun fetchData()/*: List<User> */{
        withContext(Dispatchers.IO){
         apiService.getData()
            saveData()
        }
    }

    // Função para obter dados do banco de dados local
    fun fetchUsers(): Flow<List<User>> {
        return udb.dao().fetchAllUsers()
    }

    // Função para salvar dados no banco de dados local
    suspend fun saveData(data: List<User>) {
        withContext(Dispatchers.IO){
            udb.dao().insertAllUser(data)}
    }
}//withContext

 */