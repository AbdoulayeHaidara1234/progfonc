import java.util.ArrayList;
import java.util.List;

public class TourPiste {
    static double totalTime(List<Double> lapTimes) {
        List<Double> lapTimesNoWarmup = new ArrayList<>(lapTimes);
        lapTimesNoWarmup.remove(0);
        double sum = 0;
        for(double time : lapTimesNoWarmup) {sum += time; }
        return sum;
    }

    static double avgTime(List<Double> lapTimes) {
        double time = totalTime(lapTimes);
        List<Double> lapTimesNoWarmup = new ArrayList<>(lapTimes);
        lapTimesNoWarmup.remove(0);
        int laps = lapTimesNoWarmup.size();
        return time/laps;
    }
}
