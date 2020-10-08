package com.scrooge.model.entity

import com.scrooge.model.dto.TradeDTO
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "trades")
data class Trade(@Id val id: ObjectId = ObjectId(),
                 var pair: String = "",
                 var userId: String = "",
                 var type: String? = null,
                 var status: String? = null,
                 var timeInForce: String? = null) : TradeDTO() {

	constructor(userId: String) : this() {
		this.userId = userId
	}

}
