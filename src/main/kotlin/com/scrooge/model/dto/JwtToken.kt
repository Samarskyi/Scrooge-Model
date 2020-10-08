package com.scrooge.model.dto

import java.time.Instant

data class JwtToken(val accessToken: String, val refreshToken: String, val expiresIn: Instant)
