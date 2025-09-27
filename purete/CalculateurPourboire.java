import java.util.ArrayList;
import java.util.List;

public class CalculateurPourboire {
    
    public static int pourcentage(List<String> noms) { 
        if (noms.size() > 5) { return 20; }
        else if (noms.size() > 0) { return 10; }
        else { return 0; }
        }
    }
