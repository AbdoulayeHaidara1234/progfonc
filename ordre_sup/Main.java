import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    
    static int score(String word) {
        return word.replaceAll("a", "").length();
    }

    static int scoreWithBonus(String word) {
        int base = score(word);
        return word.contains("c") ? base + 5 : base;
    }

    static Comparator<String> scoreComparator = (o1, o2) -> Integer.compare(score(o2), score(o1));

    static Comparator<String> scoreComparatorWithBonus = (o1, o2) -> Integer.compare(scoreWithBonus(o2), scoreWithBonus(o1));

    static List<String> rankedWords(List<String> words, Comparator comp) {
        
        List<String> rankedWords = new ArrayList<>(words); 
        rankedWords.sort(comp);
        return rankedWords;
    }
    
    
    public static void main(String[] args) {
        List<String> words = Arrays.asList("ada", "haskell", "scala", "java", "rust");
        System.out.println(words + "\n");

        System.out.println("ScoreComparator");
        System.out.println(rankedWords(words, scoreComparator)+"\n");

        System.out.println("ScoreComparatorWithBonus");
        System.out.println(rankedWords(words, scoreComparatorWithBonus)+"\n");
    }
}