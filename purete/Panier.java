import java.util.List;
import java.util.ArrayList;

public class Panier {
    public static int rabais(List<String> items) {
        return items.contains("Livre") ? 5 : 0;
    }
}
