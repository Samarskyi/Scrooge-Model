package com.scrooge.model.dto

import com.binance.api.client.domain.account.AssetBalance
import java.util.*

open class TotalBalanceDTO(
		open var userId: String = "",
		open var date: Date = Date(),
		open var updatedAt: Date = Date(),
		open var balances: List<BaseAsset> = listOf(),
		open var pureBalances: List<AssetBalance> = listOf()
)
