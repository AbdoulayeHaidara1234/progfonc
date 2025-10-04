import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class wordScores {
    static int score(String word) {
        return word.replaceAll("a", "").length();
    }

    static int bonus(String word) {
        return word.contains("c") ? 5:0;
    }

    static int malus(String word) {
        return word.contains("s") ? 7:0;
    }

    static List<String> rankedWords(Function<String,Integer> scoring, List<String> words) {
        List<String> copie = new ArrayList<>(words);
        copie.sort((o1, o2) -> Integer.compare(scoring.apply(o2), scoring.apply(o1)));
        return copie;
    }

    static List<Integer> wordScores(Function<String, Integer> scoring, List<String> words) {
        return words.stream().map(scoring).toList();  
    }
    
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("scala");
        list.add("haskell");
        list.add("java");

        System.out.println(rankedWords(Main::score, list));
        System.out.println(wordScores((w->score(w)+bonus(w)-malus(w)), list));
    }
}
