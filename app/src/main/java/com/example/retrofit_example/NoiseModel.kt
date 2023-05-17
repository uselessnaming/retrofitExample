package com.example.retrofit_example

data class NoiseModel(
    val currentCount: Int,
    val data: List<Data>,
    val matchCount: Int,
    val page: Int,
    val perPage: Int,
    val totalCount: Int
)