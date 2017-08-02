// Write a method that searches an Array of integers for a given integer using the 
// Binary Search Algorithm. If the input integer is found in the array, return true. Otherwise, return false.
// You can assume that the given array of integers is already sorted
// in ascending order

public static Boolean binarySearch(int[] arr, int n){
    if(arr.length == 0) {
        return false;
    }
    int index = arr[arr.length/2];
    if(index == n){
        return true;
    }
    
    if(arr.length <= 1){
            return false;
        }
        
    if(index > n){
        
        return binarySearch(Arrays.copyOfRange(arr, 0, arr.length/2 - 1), n);
    }
    else {
        return binarySearch(Arrays.copyOfRange(arr, arr.length/2 + 1, arr.length), n);
    }
}

public static Boolean binarySearch(int[] arr, int n){
    if(arr == null || arr.length < 1) return false;
    int mid = arr[arr.length/2];
    if(mid == n) return true;
 
    if(mid > n) {
        return binarySearch(Arrays.copyOfRange(arr, 0, arr.length/2 - 1),n);
    }
    else {
        return binarySearch(Arrays.copyOfRange(arr, arr.length/2 + 1, arr.length),n);
    }
    
}