package com.scrooge.model.entity

import com.scrooge.model.dto.DealDTO
import com.scrooge.model.utils.format
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "deals")
data class Deal(@Id var id: ObjectId = ObjectId()) : DealDTO() {

	constructor(userId: String) : this() {
		this.userId = userId
	}

	constructor(userId: String, profit: Double) : this() {
		this.userId = userId
		this.profit = profit
	}

	override fun toString(): String {
		return "Pair: $pair, " +
				"Buy : ${buyPrice.format(5)}, " +
				"Sell : ${sellPrice.format(5)}, " +
				"profit : ${profit.format(6)}"
	}

}
