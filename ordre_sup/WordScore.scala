object WordScore {
    def score(word: String): Int = word.replaceAll("a", "").length
    def bonus(word: String): Int = if (word.contains("c")) 5 else 0
    def malus(word: String): Int = if (word.contains("s")) 7 else 0 



    def rankedWords(scoring: String => Int, words : List[String]) : List[String] = {
        //def negativeScoring(word: String): Int = - scoring(word)
        //words.sortBy(negativeScoring)
        words.sortBy(scoring).reverse
    }

    def wordScores(scoring: String => Int, words: List[String]): List[Int] = words.map(scoring)


    def main(args: Array[String]):Unit = {
        val list = List("scala", "haskell", "java", "octave")
        //V3
        //println(rankedWords((w => score(w) + bonus(w) - malus(w)), list))
        println(wordScores((w => score(w) + bonus(w) - malus(w)), list))


    }
}

