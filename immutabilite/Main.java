import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<String> planA = new ArrayList<>();
        planA.add("Paris");
        planA.add("Nantes");


        List<String> planB = Plan.replanifie(planA, "Rennes", "Nantes");

        System.out.println("Plan A : " + planA);
        System.out.println("Plan B : " + planB);
    }

    
}
