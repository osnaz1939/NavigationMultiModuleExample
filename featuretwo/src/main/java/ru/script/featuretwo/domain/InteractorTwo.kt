package ru.script.featuretwo.domain

import ru.script.base_interfaces.EntetyOneRepo
import ru.script.data_entetyone.EntetyOneRepoImpl

class InteractorTwo {
    private val repo: EntetyOneRepo = EntetyOneRepoImpl()

    suspend fun getDataDB():String{
        return repo.getFromDb()
    }
}