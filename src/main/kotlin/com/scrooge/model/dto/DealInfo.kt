package com.scrooge.model.dto

import com.scrooge.model.trade.TradingConfig
import com.scrooge.model.utils.format
import com.scrooge.model.utils.getDiffInPercent

data class DealInfo(val pair: String,
                    val base: String,
                    val alt: String,
                    val total: Double,
                    val buyPrice: Double,
                    val currentPrice: Double,
                    val enoughToSell: Boolean = false,
                    var state: TraderStateDTO? = null,
                    var config: TradingConfig? = null) {

	val profit = if (buyPrice.isNaN()) Double.NaN.toString() else buyPrice.getDiffInPercent(currentPrice).format(2)
}
