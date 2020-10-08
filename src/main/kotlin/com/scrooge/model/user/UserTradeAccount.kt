package com.scrooge.model.user

import com.scrooge.model.trade.TradingPair
import java.util.*

class UserTradeAccount(var user: User, var settings: UserTradingSettings) {

	fun getUsrId() = user.id.toString()

	fun getConfig() = settings.baseTradeConfig

	fun getAltList() = settings.tradingPairs.map { it.alt }

	fun getBaseCurrency() = settings.tradingPairs.firstOrNull()?.base ?: ""

	fun getTradingPairs(): MutableList<TradingPair> {
		return settings.tradingPairs
	}

	fun addTradingPair(pair: TradingPair) {
		if (!settings.tradingPairs.contains(pair)) {
			settings.tradingPairs.add(pair)
		}
	}

	fun removeTradingPair(pair: TradingPair) {
		Optional.ofNullable(settings.tradingPairs.find {
			it.alt.equals(pair.alt, true) &&
					it.base.equals(pair.base, true)
		}).ifPresent { settings.tradingPairs.remove(it) }
	}

	override fun toString(): String {
		return "User: $user, Settings: $settings"
	}

	fun setBaseCurrency(base: String) {
		getTradingPairs().forEach { it.base = base.toUpperCase() }
	}

}
