package com.scrooge.model.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.scrooge.model.enums.BuyReason
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
open class DealDTO(
		open var userId: String = "",
		open var pair: String = "",
		open var base: String = "",
		open var alt: String = "",
		open var buyPrice: Double = 0.0,
		open var sellPrice: Double = 0.0,
		open var qty: Double = 0.0,
		open var volume: Double = 0.0,
		open var profit: Double = 0.0,
		open var diff: Double = 0.0,
		open var openReason: BuyReason = BuyReason.Non,
		open var openDate: Date = Date(),
		open var closeDate: Date = Date(),
		open var trades: List<TradeDTO> = listOf()
)