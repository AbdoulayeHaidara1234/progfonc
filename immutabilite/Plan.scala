object Plan  {
    def main(args: Array[String]): Unit = {
       def replanifie(plan: List[String], nouvelleVille: String, avantVille: String): List[String] = {
            val index = plan.indexOf(avantVille)
            val villeAvant = plan.slice(0, index)
            val villeApres = plan.slice(index, plan.size)
            villeAvant.appended(nouvelleVille).appendedAll(villeApres)

            
        } 

        val plan1 = List("Paris", "Nantes")
        println("Plan 1 " + plan1)

        println("Après replanifie")
        val plan2 = replanifie(plan1, "Rennes", "Nantes")
        println("Plan 2 " + plan2)

    }

    
}