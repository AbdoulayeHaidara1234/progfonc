object Exos {
    def main(args: Array[String]): Unit = {
        
        def firstTwo(list : List[String]) : List[String] = {
            val twoChar = list.slice(0,2)
            twoChar
        }

        def lastTwo(list: List[String]): List[String] = {
            val taille = list.size
            val lastChar = list.slice(taille-2,taille)
            lastChar
        }

        def movedFirstTwoToTheEnd(list: List[String]): List[String] = {
            val twoChar = firstTwo(list)
            val afterTwo = list.slice(2, list.size)
            afterTwo.appendedAll(twoChar)
        }

        def insertBeforeLast(list: List[String], c : String): List[String] = {
            val copie = list.slice(0, list.size-1)
            val lastChar = list.slice(list.size-1, list.size)
            copie.appended(c).appendedAll(lastChar)
        }

        val list = List("a", "b", "c")
        println("list : " + list)

        val twoChar = firstTwo(list)
        println("twoChar : " + twoChar)

        val lastChar = lastTwo(list)
        println("lastChar : " + lastChar)

        val mFTTTE = movedFirstTwoToTheEnd(list)
        println("firstTwoToTheEnd : " + mFTTTE)

        val iBL = insertBeforeLast(list, "d")
        println("insertBeforeLast : " + iBL)
    }
}