package com.scrooge.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "refresh_tokens")
data class RefreshToken(
		@Id val id: ObjectId = ObjectId(),
		val email: String,
		val token: String,
		val expired: Date) {

	fun isNotExpired(): Boolean {
		return expired.after(Date())
	}

	fun isExpired(): Boolean {
		return expired.before(Date())
	}
}
