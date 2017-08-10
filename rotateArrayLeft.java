// Rotate an array to the left by k positions 
// without using extra space.k can be greater than the size of the array

public static int[] rotateLeft(int[] arr, int k) {
    while(k > arr.length) {
        k = k - arr.length;
    }
    int[] temp1 = Arrays.copyOfRange(arr, 0, k);
    int[] temp2 = Arrays.copyOfRange(arr, k, arr.length);
    
    int [] newArray = new int[temp1.length+temp2.length];
    System.arraycopy( temp2, 0, newArray, 0, temp2.length);
    System.arraycopy( temp1, 0, newArray, temp2.length, temp1.length );
    return newArray;
}