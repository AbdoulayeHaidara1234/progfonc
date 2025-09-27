import java.util.List;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
       List<String> noms = new ArrayList<>();

       noms.add("Bob");
       noms.add("Alice");
       noms.add("Jean");
       noms.add("Carlos");
       noms.add("Paul");
       noms.add("Adrien");
    
       System.out.println(noms);
       System.out.println("Pourcentage : " + CalculateurPourboire.pourcentage(noms));

           
        
    }
}