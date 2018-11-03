package net.themkat.meetup.oslo.kotlin.examples.kotlintestexamples

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.core.env.get
import org.springframework.stereotype.Controller


@Controller
class EnvController(@Autowired var environment: Environment) {

    fun getFavouriteComputers(): List<String> {
        val computers: String = environment["themkat.favouriteComputers"] ?: "Fischer Price Play Computer"
        return computers.split(",")
    }

}