package ru.sberschool.hystrix

import feign.Param
import feign.RequestLine

interface SlowlyApi {
    @RequestLine("GET /api/v2/pokemon/{id}")
    fun getPokemon(@Param("id") id: Int): Pokemon
}



