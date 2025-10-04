object HighScoringWords2 {
    def score(word: String): Int = word.replaceAll("a", "").length
    def bonus(word: String): Int = if (word.contains("c")) 5 else 0
    def malus(word: String): Int = if (word.contains("s")) 7 else 0 
    
    
    def highScoringWords(scoring: String => Int, words: List[String], n: Int): List[String] = {
        words.filter(w=>scoring(w)>n)
    }


    def highScoringWords2(scoring: String => Int): (List[String], Int) => List[String] ={
        (words: List[String], n: Int) => words.filter(w=>scoring(w)>n)
    }
    
    def main(args: Array[String]): Unit = {
        val list = List("ada", "haskell", "scala", "java", "rust")


        val hSC2 = highScoringWords2(w=>score(w)+bonus(w)-malus(w))


        println(hSC2(list, 1))
        println(hSC2(list, 0))
        println(hSC2(list, 5))
    }
}