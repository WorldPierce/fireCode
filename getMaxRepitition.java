// Given an Array of integers, write a method that will 
// return the integer with the maximum number of repetitions.

public static int getMaxRepetition(int[] a) {
    if(a == null) return 0;
    HashMap<Integer, Integer> maxRep = new HashMap<>();
    int max = 0;
    int maxCount = 0;
    for(int i = 0; i < a.length; i++) {
        Integer curr = maxRep.get(a[i]);
        if(curr != null) {
            maxRep.put(a[i], curr + 1);
            if(curr + 1 > maxCount) {
                maxCount = curr + 1;
                if(max != a[i]) {
                    max = a[i];
                }
            }
        } else {
            maxRep.put(a[i], 1);
            if(maxCount == 0) {
                max = a[i];
                maxCount = 1;
            }
        }
    }
    return max;
}