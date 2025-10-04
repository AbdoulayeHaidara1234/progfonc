import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExosFilter {
    static List<String> tailleInf5(List<String> words) {
        return words.stream().filter(w->w.length()<5).collect(Collectors.toList());
    }

    static int countL(String word) {
        return (int)word.chars().filter(c->c=='l').count();
    }

    static List<String> plusDunL(Function<String, Integer> counting, List<String> words) {
        return words.stream().filter(w->counting.apply(w)>1).toList();
    }
    
    static List<Integer> nombresPair(List<Integer> nombres) {
        return nombres.stream().filter(w->w%2==0).toList();
    }
    
    static List<Integer> sup4(List<Integer> nombres) {
        return nombres.stream().filter(w->w>4).toList();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Integer> listnb = new ArrayList<>();
         
        list.add("scala");
        list.add("haskell");
        list.add("java");
        list.add("lllll");

        System.out.println(tailleInf5(list));
        System.out.println(plusDunL(ExosFilter::countL, list));

        for(int i=0; i<10; i++) {
            listnb.add(i);
        }

        System.out.println(nombresPair(listnb));
        System.out.println(sup4(listnb));
    }
}