// Write a method - isPowOfTwo to test whether or not a given positive integer is a power of 2. 
// Your method should run in constant O(1) time and use O(1) space.


public static boolean isPowOfTwo(int num) {
    int isPow = num & num-1;
    if(isPow == 0) {
        return true;
    }
    return false;
}