package net.themkat.meetup.oslo.kotlin.examples.kotlintestexamples

import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import org.springframework.core.env.Environment

// THis will show you the power of mocking with MockK!

object MockingSpec : Spek({

    describe("mock the environment controller so we don't have to start Spring") {

        val environment = mockk<Environment>()
        val envController = EnvController(environment)

        it("should return our mocked response") {
            every { environment.getProperty("themkat.favouriteComputers") }
                    .returns("ZX Spectrum,Atari ST")

            val computers = envController.getFavouriteComputers()

            assertEquals("ZX Spectrum", computers[0])
            assertEquals("Atari ST", computers[1])
        }

    }
})