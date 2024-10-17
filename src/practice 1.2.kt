fun countVowels(y: String):Int {
    var countVow: Int = 0
    for (i in y) {
        if (i in "aeiouAEIOU") {
            countVow++
        }
    }
    return countVow
}

fun main(){
    println(countVowels("aeiou"))
}