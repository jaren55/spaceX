package com.example.spacex.repository

import com.example.spacex.models.Launch
import com.example.spacex.web.SpacexWebService
import javax.inject.Inject

class SpacexRepository @Inject constructor(val webService: SpacexWebService) {

    suspend fun getLaunches(): List<Launch> {
        //val isStale = System.currentTimeMillis() - timeStamp > dataDuration
        //if(isStale){
           // timeStamp = System.currentTimeMillis()
            return webService.fetchLaunchers()
//        }
    }

    companion object{
        private var timeStamp: Long = System.currentTimeMillis()
        private const val dataDuration = 30*60*1000 //30minutes
    }

}