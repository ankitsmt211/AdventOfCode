package dayone

class Second (private val locationsOne: MutableList<Int>, private val locationsTwo: MutableList<Int>){
    private var _similarityScore: Int = 0


    fun printData(){
        println("First List: ${this.locationsOne}")
        println("Second List: ${this.locationsTwo}")
    }

    fun prepareSimilarityScores(){
        val frequency: Map<Int, Int> = locationsTwo.groupingBy { it }.eachCount()

        for(item in locationsOne){
            val score = frequency.getOrDefault(item, 0) * item
            this._similarityScore+=score
        }

    }

    fun getSimilarityScore():Int{
        return this._similarityScore
    }
}