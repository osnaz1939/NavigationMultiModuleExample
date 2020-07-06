package ru.script.base_interfaces

interface EntetyOneRepo {
    suspend fun getData():String
    suspend fun setData(data:String)
    suspend fun getFromDb():String
    suspend fun setForDb(data:String)
}