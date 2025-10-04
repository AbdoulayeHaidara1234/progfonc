import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HighScoringWords {
    static int score(String word) {
        return word.replaceAll("a", "").length();
    }

    static int bonus(String word) {
        return word.contains("c") ? 5:0;
    }

    static int malus(String word) {
        return word.contains("s") ? 7:0;
    }

    static List<String> highScoringWords(Function<String, Integer> scoring, List<String> words) {
        return words.stream().filter(w->scoring.apply(w)>1).toList();
    }
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("scala");
        list.add("haskell");
        list.add("java");

        System.out.println(highScoringWords((w->score(w)+bonus(w)-malus(w)), list));
    }
}
