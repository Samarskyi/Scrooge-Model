package com.scrooge.model.entity

import com.scrooge.model.enums.LogType
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "logs")
data class LogEvent(val userId: String, val type: LogType, val date: Date, val mess: String)