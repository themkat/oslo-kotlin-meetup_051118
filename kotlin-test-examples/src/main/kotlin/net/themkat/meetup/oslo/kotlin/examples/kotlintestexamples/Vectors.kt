package net.themkat.meetup.oslo.kotlin.examples.kotlintestexamples

import kotlin.math.pow
import kotlin.math.sqrt

data class Vector(val x: Float, val y: Float, val z: Float) {

    // cross product
    // only really included to show you the power of operator overloading if you haven't already seen!
    // This is awesome! :D
    operator fun times(other: Vector): Vector {
        return Vector(
                (y * other.z - z * other.y),
                (z * other.x - x * other.z),
                (x * other.y - y * other.x))
    }

}


fun length(vector: Vector) = sqrt(vector.x.pow(2) + vector.y.pow(2) + vector.z.pow(2))