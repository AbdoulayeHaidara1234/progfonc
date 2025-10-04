object HighScoringWords {
    def score(word: String): Int = word.replaceAll("a", "").length
    def bonus(word: String): Int = if (word.contains("c")) 5 else 0
    def malus(word: String): Int = if (word.contains("s")) 7 else 0 
    
    
    def highScoringWords(scoring: String => Int, words: List[String]): List[String] = {
        words.filter(w=>scoring(w)>1)
    }
    
    def main(args: Array[String]): Unit = {
        val list = List("ada", "haskell", "scala", "java", "rust")

        println(highScoringWords(w=>score(w)+bonus(w)-malus(w), list))
    }
}