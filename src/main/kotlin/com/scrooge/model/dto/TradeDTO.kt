package com.scrooge.model.dto

import java.util.*

open class TradeDTO(
		open var side: String = "",
		open var price: Double = 0.0,
		open var qty: Double = 0.0,
		open var date: Date = Date(),
		open var orderId: Long = -1,
		open var tradeId: Long = 1,
		open var newClientOrderId: String? = null
)
