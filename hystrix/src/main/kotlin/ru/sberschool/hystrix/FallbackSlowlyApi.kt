package ru.sberschool.hystrix

class FallbackSlowlyApi : SlowlyApi {
    override fun getPokemon(id: Int) = Pokemon(listOf(), -1, listOf())
}


