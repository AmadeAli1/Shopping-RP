package com.amade.dev.shoppingapp.model.user.dto

import com.amade.dev.shoppingapp.model.user.DeliveryLocation
import com.amade.dev.shoppingapp.model.user.User

data class UserDTO(
    val user: User,
    val deliveryLocation: DeliveryLocation?,
)
