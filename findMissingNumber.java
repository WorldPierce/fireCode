
// Given an Array containing 9 numbers ranging from 1 to 10, write a method to find the missing number. 
// Assume you have 9 numbers between 1 to 10 and only one number is missing.

public static int findMissingNumber(int[] arr) {
    Arrays.sort(arr);
    for(int i = 0; i < arr.length; i++){
        if(arr[i] + 1 != arr[i+1]){
            return arr[i] + 1;
        }
    }
    return 0;
}