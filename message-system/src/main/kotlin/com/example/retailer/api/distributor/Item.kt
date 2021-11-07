package com.example.retailer.api.distributor

/**
 * Описание товара
 */
data class Item(
    /**
     * Произвольный идентификатор
     */
    val id: Long,

    /**
     * Произвольное название
     */
    val name: String
)