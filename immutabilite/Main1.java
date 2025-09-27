import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Double> lapTimes = new ArrayList<>();

        lapTimes.add(31.0);
        lapTimes.add(20.9);
        lapTimes.add(21.1);
        lapTimes.add(21.3);

        System.out.println(TourPiste.totalTime(lapTimes));
        System.out.println(TourPiste.avgTime(lapTimes));
    }
}