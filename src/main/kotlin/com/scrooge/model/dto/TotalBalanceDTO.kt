package com.scrooge.model.dto

import java.util.*

open class TotalBalanceDTO(
		open var userId: String = "",
		open var date: Date = Date(),
		open var balances: List<BaseAsset> = listOf()
)