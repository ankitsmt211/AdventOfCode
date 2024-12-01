package org.alphabee.dayone

import java.io.File
import kotlin.math.abs

class First {
    private val locationsOne: MutableList<Int> = mutableListOf()
    private val locationsTwo: MutableList<Int> = mutableListOf()
    private var _distance: Int = 0

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

    fun sortIncrementally(){
        this.locationsOne.sort()
        this.locationsTwo.sort()
    }

    fun updateDistance(){
        for(index in 0..locationsOne.lastIndex){
            this._distance+=abs(locationsOne[index] - locationsTwo[index])
        }
    }

    fun getDistance(){
        println(this._distance)
    }

    fun printData(){
        println(this.locationsOne)
        println(this.locationsTwo)
    }

    fun checkLength(){
        println(locationsOne.size==locationsTwo.size)
    }
}