package dayone

import java.io.File

fun main() {

    val pairOfLists = prepareData(fileName = "src/main/kotlin/dayone/input.txt")

    println("PART-1")
    println()
    val initFirst = First(pairOfLists.first, pairOfLists.second)
    initFirst.sortIncrementally()
    initFirst.printData()
    initFirst.updateDistance()
    println("Answer for Part-1: ${initFirst.getDistance()}")
    println()

    println("#".repeat(10000))
    println("#".repeat(10000))
    println()
    println("PART-2")

    val initSecond = Second(pairOfLists.first, pairOfLists.second)
    initSecond.printData()
    initSecond.prepareSimilarityScores()
    println("Answer for Part-2: ${initSecond.getSimilarityScore()}")

}

fun prepareData(fileName: String): Pair<MutableList<Int>, MutableList<Int>> {
    val locationsOne: MutableList<Int>  = mutableListOf()
    val locationsTwo: MutableList<Int> = mutableListOf()

    File(fileName).forEachLine {
        val row = it.split(" ")
        try {
            locationsOne.add(row.first().trim().toInt())
            locationsTwo.add(row.last().trim().toInt())
        }
        catch (e: NumberFormatException){
            println("Not a valid number")
        }
    }
    return Pair(locationsOne, locationsTwo)
}