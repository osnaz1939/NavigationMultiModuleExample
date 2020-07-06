package ru.script.featureone.domain

import ru.script.base_interfaces.EntetyOneRepo
import ru.script.data_entetyone.EntetyOneRepoImpl

//TODO create inject into VM
class InteractorOne {
    //TODO create inject with kodein
    private val  repo:EntetyOneRepo = EntetyOneRepoImpl()

    suspend fun getData():String{
        return repo.getData()
    }

    suspend fun getDataLocal():String{
        return repo.getFromDb()
    }
}