package ru.script.data_entetyone.networkds

import ru.script.base.network.NetClient

//TODO kodein
class NetworkDS {
    private val netClient = NetClient()

    suspend fun getData():String{
        return netClient.getDataNet()
    }
}