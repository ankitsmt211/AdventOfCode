package org.alphabee

import org.alphabee.dayone.First
import org.alphabee.dayone.Second

fun main() {
//    val initFirst = First()
//    initFirst.printData()
//    initFirst.prepareData(fileName = "src/main/kotlin/dayone/input.txt")
//    initFirst.printData()
//    initFirst.sortIncrementally()
//    initFirst.printData()
//    initFirst.getDistance()
//    initFirst.updateDistance()
//    initFirst.getDistance()
//    initFirst.checkLength()


    val initSecond = Second()
    initSecond.printData()
    initSecond.prepareData(fileName = "src/main/kotlin/dayone/input.txt")
    initSecond.printData()


    initSecond.prepareSimilarityScores()
    initSecond.printSimilarity()

}