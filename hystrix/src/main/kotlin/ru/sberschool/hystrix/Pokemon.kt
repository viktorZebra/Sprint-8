package ru.sberschool.hystrix

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class Pokemon(
    @JsonProperty("abilities")
    val abilities: List<Ability>,

    @JsonProperty("base_experience")
    val base_experience: Int,

    @JsonProperty("forms")
    val forms: List<PropertyInfo>
)

data class Ability(
    @JsonProperty("ability")
    val ability: PropertyInfo,

    @JsonProperty("is_hidden")
    val is_hidden: Boolean,

    @JsonProperty("slot")
    val slot: Int
)

data class PropertyInfo(
    @JsonProperty("name")
    val name: String,

    @JsonProperty("url")
    val url: String
)

