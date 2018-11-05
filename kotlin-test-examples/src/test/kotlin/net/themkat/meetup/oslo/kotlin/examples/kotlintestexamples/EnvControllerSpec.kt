package net.themkat.meetup.oslo.kotlin.examples.kotlintestexamples

import net.themkat.spek.spring.utils.context.springContext
import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe


// This we will do in the meetup :)

object EnvControllerSpec : Spek({

    springContext("net.themkat.meetup.oslo.kotlin.examples.kotlintestexamples") {
        val envController = inject<EnvController>()

        describe("using environment controller") {

            val favouriteComputers = envController.getFavouriteComputers()

            assertEquals(4, favouriteComputers.size)
        }

    }
})