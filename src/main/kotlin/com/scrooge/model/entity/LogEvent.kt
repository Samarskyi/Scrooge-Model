package com.scrooge.model.entity

import com.scrooge.model.enums.LogType
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "logs")
data class LogEvent(@Id val id: ObjectId = ObjectId.get(), val userId: String, val type: LogType, val date: Date, val mess: String, val count: Long = 0)