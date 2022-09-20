package com.amade.dev.shoppingapp

import kotlinx.coroutines.delay
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@EnableAsync
@SpringBootApplication
class ShoppingAppApplication

fun main(args: Array<String>) {
    runApplication<ShoppingAppApplication>(*args)
}
