import java.util.ArrayList;
import java.util.List;

public class Plan {
    public static List<String> replanifie(List<String> plan, String nouvelleVille, String avantVille) {
            int index = plan.indexOf(avantVille);
            List<String> planB = new ArrayList<>(plan);
            
            planB.add(index, nouvelleVille);
            return planB;
    }
}
