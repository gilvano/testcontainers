package io.gilvano.testcontainers

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<TestcontainersApplication>().with(TestcontainersConfiguration::class).run(*args)
}
