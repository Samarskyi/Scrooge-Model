package com.scrooge.model.user

import com.scrooge.model.trade.TradingConfig
import com.scrooge.model.trade.TradingPair
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user_trading_settings")
class UserTradingSettings {

	@Id
	lateinit var id: ObjectId
	lateinit var userId: ObjectId

	var tradingPairs: MutableList<TradingPair> = mutableListOf()
	var baseTradeConfig = TradingConfig.defaultConfig()

	override fun toString(): String {
		return "UserTradingSettings, Trading pairs: $tradingPairs, baseTradeConfig: $baseTradeConfig"
	}
}
