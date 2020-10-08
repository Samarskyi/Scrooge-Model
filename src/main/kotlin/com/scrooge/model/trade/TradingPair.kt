package com.scrooge.model.trade

data class TradingPair(var base: String, val alt: String) {

	fun getPair() = alt.plus(base).toUpperCase()

	companion object {

		fun of(base: String, alt: String): TradingPair {
			return TradingPair(base, alt)
		}

	}

}
