package com.example.retailer.api.distributor

/**
 * Описание заказа
 */
data class Order(
    /**
     * Уникальный идентификатор заказа на стороне ретейлера
     */
    val id: String?,

    /**
     * Произвольный адрес доставки
     */
    val address: String,

    /**
     * Произвольный получатель доставки
     */
    val recipient: String,

    /**
     * Список заказанных товаров
     */
    val items: List<Item>
)