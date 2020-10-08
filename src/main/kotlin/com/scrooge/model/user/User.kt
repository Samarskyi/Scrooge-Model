package com.scrooge.model.user

import com.fasterxml.jackson.annotation.JsonIgnore
import com.scrooge.model.enums.AccountStatus
import com.scrooge.model.enums.BotStatus
import com.scrooge.model.enums.Role
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class User(
		@Id val id: ObjectId = ObjectId(),
		@Indexed(unique = true) val email: String,
		@JsonIgnore var password: String = "",
		var apiKey: String = "",
		var apiSecret: String = "",
		var telegramBotInfo: TelegramBotInfo? = null,
		var referrerId: ObjectId? = null,
		var profitFeePercent: Double = 0.3,
		var domain: String = "com",
		@JsonIgnore var botIPAddress: String = "",
		val roles: List<Role> = mutableListOf(Role.ROLE_CLIENT),
		var status: AccountStatus = AccountStatus.ACTIVE,
		var botStatus: BotStatus? = null
)
