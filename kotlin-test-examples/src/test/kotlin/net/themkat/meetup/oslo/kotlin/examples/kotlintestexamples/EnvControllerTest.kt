package net.themkat.meetup.oslo.kotlin.examples.kotlintestexamples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension


// This we will do in the meetup :)

@SpringBootTest
@ExtendWith(SpringExtension::class)
class EnvControllerTest {

    @Autowired
    lateinit var envController: EnvController

    @Test
    fun computers() {
        val favouriteComputers = envController.getFavouriteComputers()

        assertEquals(4, favouriteComputers.size)
    }

}