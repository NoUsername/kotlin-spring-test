package at.paukl.kotlintest

import org.springframework.boot.SpringApplication

fun main(args: Array<String>) {
    println("Starting...")
    SpringApplication.run(Application::class.java, *args)
}