package com.amade.dev.shoppingapp

import kotlinx.coroutines.delay
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@EnableAsync
@SpringBootApplication
class ShoppingAppApplication : CommandLineRunner {

    override fun run(vararg args: String?) {}

    suspend fun test() {
        delay(3000)
        println("Hello")
    }

}

fun main(args: Array<String>) {
    runApplication<ShoppingAppApplication>(*args)
}
