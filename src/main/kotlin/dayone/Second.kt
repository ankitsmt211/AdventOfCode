package org.alphabee.dayone

import java.io.File

class Second {
    private val locationsOne: MutableList<Int> = mutableListOf()
    private val locationsTwo: MutableList<Int> = mutableListOf()
    private var _similarityScore: Int = 0

    fun prepareData(fileName: String){
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
    }


    fun printData(){
        println(this.locationsOne)
        println(this.locationsTwo)
    }

    fun checkLength(){
        println(locationsOne.size==locationsTwo.size)
    }

    fun prepareSimilarityScores(){
        val frequency: MutableMap<Int, Int> = mutableMapOf()
        for(item in locationsTwo){
            frequency[item] = frequency[item]?.plus(1) ?: 1
            // if present add plus one
            //else 0
        }

        for(item in locationsOne){
            val score = (frequency[item] ?:0 ) * item
            this._similarityScore+=score
        }

        println(frequency)
    }

    fun printSimilarity(){
        println(this._similarityScore)
    }
}