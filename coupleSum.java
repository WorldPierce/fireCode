// Given an array of integers, find two numbers such that they sum up to a specific target.
// The method coupleSum should return the indices of the two numbers in the array, where index1 must be less than index2. 
// Please note that the indices are not zero based, and you can assume that each input has exactly one solution. Target linear runtime and space complexity.

public static int[] coupleSum(int[] numbers, int target) {
    HashMap<Integer, Integer> targets = new HashMap<>();
    for(int i = 0; i < numbers.length; i++) {
        if(targets.containsKey(numbers[i])) {
            return new int[] {targets.get(numbers[i]) + 1, i + 1};
        }
        int newTarget = target - numbers[i];
        if(newTarget > 0) {
            targets.put(newTarget, i);
        }
    }
    return null;
}