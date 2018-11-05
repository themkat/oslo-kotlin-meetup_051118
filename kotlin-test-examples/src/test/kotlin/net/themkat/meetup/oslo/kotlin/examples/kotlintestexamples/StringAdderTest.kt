package net.themkat.meetup.oslo.kotlin.examples.kotlintestexamples

import junit.framework.Assert.assertEquals
import org.junit.Test

// This we will do in the meetup :)

class StringAdderTest {

    @Test
    fun `stringAdder given valid number string, should return sum`() {
        val result = stringAdder("5,10,64")

        assertEquals(79, result)
    }
}