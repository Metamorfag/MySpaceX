package com.example.myspacex.domain

interface LaunchesRepository {
    suspend fun getLaunches(year: String, reload: Boolean = false): List<LaunchData>
    suspend fun getLaunchData(year: String, id: Int): LaunchData
}