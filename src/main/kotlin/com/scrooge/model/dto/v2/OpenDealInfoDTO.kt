package com.scrooge.model.dto.v2

import com.binance.api.client.domain.account.Order
import com.binance.api.client.domain.account.Trade
import com.scrooge.model.enums.BuyReason

data class OpenDealInfoDTO(
		val userId: String,
		val alt: String,
		val base: String,
		val pair: String = alt + base,
		val buyPrice: String,
		val currentPrice: String,
		val diffInPercent: String,
		val qty: String,
		val volume: String,
		val openReason: BuyReason,
		var closePrice: String? = null,
		val orders: LinkedHashSet<Order> = LinkedHashSet(),
		val trades: LinkedHashSet<Trade> = LinkedHashSet()
)