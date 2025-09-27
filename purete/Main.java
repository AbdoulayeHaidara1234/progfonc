import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       List<String> items = new ArrayList<>();

       items.add("Pomme");
       items.add("Livre");
       items.add("Livre");
    
       System.out.println("Avant remove");
       System.out.println(items);
       System.out.println(Panier.rabais(items));


       System.out.println("Après remove");
       items.remove("Livre");
       System.out.println(items);
       System.out.println(Panier.rabais(items));
       
    
        
    }
}