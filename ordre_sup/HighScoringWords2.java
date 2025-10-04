import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HighScoringWords2 {
    static int score(String word) {
        return word.replaceAll("a", "").length();
    }

    static int bonus(String word) {
        return word.contains("c") ? 5:0;
    }

    static int malus(String word) {
        return word.contains("s") ? 7:0;
    }

    static BiFunction<List<String>, Integer, List<String>> highScoringWords2(Function<String, Integer> scoring) {
        return (words, n) -> words.stream().filter(w->scoring.apply(w)>n).toList();
    }
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        BiFunction<List<String>, Integer, List<String>> hSC2 = highScoringWords2( w->score(w)+bonus(w)-malus(w));
       
        
        list.add("scala");
        list.add("haskell");
        list.add("java");

        System.out.println(hSC2.apply(list, 1));
        System.out.println(hSC2.apply(list, 0));
        System.out.println(hSC2.apply(list, 5));
    }
}
