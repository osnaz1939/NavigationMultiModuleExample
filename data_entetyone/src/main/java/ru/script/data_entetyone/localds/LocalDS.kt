package ru.script.data_entetyone.localds

import ru.script.base.local.DBClient


class LocalDS {

    private val localClient = DBClient()

    suspend fun getData():String{
        return localClient.getDataDB()
    }
}