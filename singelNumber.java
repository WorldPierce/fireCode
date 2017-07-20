// Write a method that returns a number that appears only once in an array.
// Assume the array will surely have a unique value. The array will never be empty.

public static int singleNumber(int[] A) {
    
    Hashtable<Integer,Integer> numbers = new Hashtable<Integer,Integer>();
    for(int i = 0; i < A.length; i++){
        int count = numbers.containsKey(A[i]) ? numbers.get(A[i]) : 0;
        numbers.put(A[i], count + 1);
    }
    Set<Integer> keys = numbers.keySet();
    for(int key : keys){
        if(numbers.get(key) == 1){
            return key;
        }
    }
    return 0;
}