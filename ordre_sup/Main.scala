object Main {   

    def main (args: Array[String]): Unit = {
        
        //println("haskell".count(c => c=="l"))

        //println(List(5, 1, 2, 4, 0).filter(i => i > 4))

        println(List(5, 1, 2, 4, 0).foldLeft(0)((acc:Int, nb : Int) => acc+nb))

        println(List("skala", "haskell", "java").foldLeft(0)((acc:Int, word:String)=> acc+word.length))
    
        def containS(mot:String): Int = {
            mot.foldLeft(0)()
        }
       
        println("skala".conta)

        List("skala", "haskell", "java").foldLeft(0)((acc:Int, word:String)=>)   
    }
}