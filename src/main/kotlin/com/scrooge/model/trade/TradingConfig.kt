package com.scrooge.model.trade

/**
 * @profit Minimum pure profit per deal
 * @tradeMultiply Represent multiplication factor of the minimum order value
 * @belowAverage Used to determine entry point
 * @fee Per deal. To get full Fee amount need to double multiply
 */
data class TradingConfig(
		var profit: Double = 3.0,
		var tradeMultiply: Int = 1,
		var fee: Double = 0.1,
		var belowAverage: Double = 1.0,
		var candleStickIntervalId: String = "1h",
		var emaPeriod: Int = 3,
		val fixedProfit: Boolean = true,
		val dynamicProfit: Boolean = false,
		val stopLossProfit: Boolean = false) {

	fun fullFee() = fee * 2

	companion object {
		fun defaultConfig() = TradingConfig()
	}

}