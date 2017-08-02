// The idea behind the classic Mergesort algorithm is to divide an array in half, sort each half, and then use
// a merge() method to merge the two halves into a single sorted array. 


// Implement the merge() method that takes in 
// two sorted arrays and returns a third sorted array that contains elements of both the input arrays. 

// You can assume
// that the input arrays will always be sorted in ascending order and can have different sizes

public static int[] merge(int[] arrLeft, int[] arrRight){
    int left = 0, right = 0, index = 0;
    int[] sorted = new int[arrLeft.length + arrRight.length];
    while(left != arrLeft.length && right != arrRight.length) {
        int insert = arrLeft[left] <=  arrRight[right] ? arrLeft[left++] : arrRight[right++];
        sorted[index++] = insert;
    }
    while(left < arrLeft.length) {
        sorted[index++] = arrLeft[left++];
    }
    while(right < arrRight.length) {
        sorted[index++] = arrRight[right++];
    }
    return sorted;
}