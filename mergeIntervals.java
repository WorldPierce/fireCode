// A Range Module is a module that tracks ranges of numbers. 
// Range modules are used extensively when designing scalable online game maps with millions of players. 
// our task is to write a method - mergeIntervals that takes in an ArrayList of integer 
// Interval s (aka ranges), and returns an 
// ArrayList of sorted Interval s where all overlapping intervals have been merged.

public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervalsList) {
    if (intervalsList == null || intervalsList.size() < 2) {
        return intervalsList;
    } else {
        ArrayList<Interval> out = new ArrayList<>();
        Collections.sort(intervalsList, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.start, o2.start);
            }
        });

        Interval prev = intervalsList.get(0);
        for (int i = 1; i < intervalsList.size(); i++) {
            Interval cur = intervalsList.get(i);
            // Merge if not overlapping
            if (cur.start <= prev.end) {
                prev = new Interval(prev.start, Math.max(cur.end, prev.end));
            } else {
                // Otherwise add and update curInterval
                out.add(prev);
                prev = cur;
            }
        }
        out.add(prev);
        return out;
    }
}