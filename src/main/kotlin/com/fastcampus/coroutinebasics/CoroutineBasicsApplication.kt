package com.fastcampus.coroutinebasics

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoroutineBasicsApplication

fun main(args: Array<String>) {
    runApplication<CoroutineBasicsApplication>(*args)
}
