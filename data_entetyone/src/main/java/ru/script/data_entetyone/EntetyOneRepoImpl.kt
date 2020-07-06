package ru.script.data_entetyone

import ru.script.base_interfaces.EntetyOneRepo
import ru.script.data_entetyone.localds.LocalDS
import ru.script.data_entetyone.networkds.NetworkDS

//TODO kodein
class EntetyOneRepoImpl:EntetyOneRepo {
    private val netDs = NetworkDS()
    private val locDs = LocalDS()

    override suspend fun getData(): String {
        return netDs.getData()
    }

    override suspend fun setData(data: String) {
        TODO("Not yet implemented")
    }

    override suspend fun getFromDb(): String {
        return locDs.getData()
    }

    override suspend fun setForDb(data: String) {
        TODO("Not yet implemented")
    }
}