package net.themkat.meetup.oslo.kotlin.examples.kotlintestexamples


// Takes numbers (integers) separated by commas and adds them together
fun stringAdder(numbersAsStrings: String): Int {
    return numbersAsStrings.split(",").map { it.toIntOrNull() ?: 0 }.sum()
}
