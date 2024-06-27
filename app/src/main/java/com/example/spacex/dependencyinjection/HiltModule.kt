package com.example.spacex.dependencyinjection

import com.example.spacex.web.SpacexWebService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HiltModule{
    @Provides
    @Singleton
    fun provideretrofit() = Retrofit.Builder()
        .baseUrl("https://api.spacexdata.com/v5/launches")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    @Singleton
    fun provideWebService(retrofit:Retrofit): SpacexWebService =
        retrofit.create(SpacexWebService::class.java)

}