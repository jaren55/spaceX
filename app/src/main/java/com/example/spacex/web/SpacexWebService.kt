package com.example.spacex.web

import com.example.spacex.models.Launch
import retrofit2.http.GET

interface SpacexWebService {
    @GET
    suspend fun fetchLaunchers(): List<Launch>
}