package net.themkat.meetup.oslo.kotlin.examples.kotlintestexamples

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe


// this we will do in the meetup :)

object StringAdderSpec : Spek({
    describe("string adder functionality") {
        it("should return 9") {
            val result = stringAdder("4,3,2")

            assertEquals(9, result)
        }
    }
})