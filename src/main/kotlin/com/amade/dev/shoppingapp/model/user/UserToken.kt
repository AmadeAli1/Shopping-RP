package com.amade.dev.shoppingapp.model.user

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import java.util.*

@Table("Token")
data class UserToken(
    @Column("createdAt") val createdAt: LocalDateTime = LocalDateTime.now(),
    @Column("confirmedAt") var confirmedAt: LocalDateTime? = null,
    @Column("expiredAt") val expiredAt: LocalDateTime = createdAt.plus(3L, ChronoUnit.HOURS),
    @Column("isValid") var valid: Boolean = true,
    @Column("userId") val userId: String,
) {
    @Id
    @Column("uid")
    lateinit var uid: UUID
}
