package dayone

import kotlin.math.abs

class First (locationsOne: MutableList<Int>, locationsTwo: MutableList<Int>) {
    private var _distance: Int = 0
    private val copyOfLocationsOne:MutableList<Int> = locationsOne.toMutableList()
    private val copyOfLocationsTwo:MutableList<Int> = locationsTwo.toMutableList()

    fun sortIncrementally(){
        this.copyOfLocationsOne.sort()
        this.copyOfLocationsTwo.sort()
    }

    fun updateDistance(){
        for(index in 0..copyOfLocationsOne.lastIndex){
            this._distance+=abs(copyOfLocationsOne[index] - copyOfLocationsTwo[index])
        }
    }

    fun getDistance(): Int{
        return this._distance
    }

    fun printData(){
        println("First List: ${this.copyOfLocationsOne}")
        println("Second List: ${this.copyOfLocationsTwo}")
    }
}