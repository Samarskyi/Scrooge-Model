package com.scrooge.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "referrals")
data class ReferralEntity(
		@Id val id: ObjectId = ObjectId(),
		val referrerId: ObjectId,
		var referees: MutableSet<ObjectId> = mutableSetOf(),
		val bonusPercent: Double = 0.05
)
