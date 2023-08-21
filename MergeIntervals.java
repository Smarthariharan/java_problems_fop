import java.util.*;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Interval> intervals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            intervals.add(new Interval(start, end));
        }

        List<Interval> mergedIntervals = merge(intervals);

        for (Interval interval : mergedIntervals) {
            System.out.println(interval.start + " " + interval.end);
        }
        sc.close();
    }

    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals.isEmpty()) {
            return new ArrayList<>();
        }

        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        List<Interval> merged = new ArrayList<>();
        Interval currentInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);

            if (interval.start <= currentInterval.end) {
                currentInterval.end = Math.max(currentInterval.end, interval.end);
            } else {
                merged.add(currentInterval);
                currentInterval = interval;
            }
        }

        merged.add(currentInterval);
        return merged;

    }
}
