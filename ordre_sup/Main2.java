import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main2 {
    

    static Function<String, Integer> score = word -> word.replaceAll("a", "").length();

    static Function<String, Integer> scoreWithBonusFunction = new Function<String,Integer>() {      
        public Integer apply(String word) {
            int base = score.apply(word);
            return word.contains("c") ? base + 5 : base;
        }
    };

    static Function<String, Integer> scoreWithMalusFunction = new Function<String,Integer>() {
        public Integer apply(String word) {
            int base = scoreWithBonus(word);
            return word.contains("s") ? base - 7 : base;
        }
    };

    static int scoreWithBonus(String word) {
        int base = score.apply(word);
        return word.contains("c") ? base + 5 : base;
    }


    static List<String> rankedWords(Function<String, Integer> scoring, List<String> words) {
        
        List<String> rankedWords = new ArrayList<>(words); 
        rankedWords.sort((o1, o2) -> Integer.compare(scoring.apply(o2), scoring.apply(o1)));
        return rankedWords;
    }

    
    
    public static void main(String[] args) {
        List<String> words = Arrays.asList("ada", "haskell", "scala", "java", "rust");
        System.out.println(words + "\n");

        System.out.println(rankedWords(scoreWithBonusFunction, words));
        System.out.println(rankedWords(w -> scoreWithBonus(w), words));
       // System.out.println(rankedWords(Classe::scoreWithBonus, words));

        System.out.println(rankedWords(scoreWithMalusFunction, words));

       
    }
}