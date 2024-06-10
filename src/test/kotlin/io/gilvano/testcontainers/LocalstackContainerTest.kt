package io.gilvano.testcontainers

import org.junit.jupiter.api.Test
import org.testcontainers.containers.localstack.LocalStackContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers
import org.testcontainers.utility.DockerImageName

@Testcontainers
class LocalstackContainerTest {

    companion object {
        @Container
        private val localstack = LocalStackContainer(
            DockerImageName.parse("localstack/localstack")
        ).withServices(LocalStackContainer.Service.SQS)
    }

    @Test
    fun test() {
        println("Localstack URL: ${localstack.endpoint.toURL()}")
    }

}