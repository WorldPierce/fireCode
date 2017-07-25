// Given an array of integers, write a method - maxGain - that returns the maximum gain. 

public static int maxGain(int[] a) {
    if(a.length <= 1 ) return 0;
    int gain = 0, min = a[0];
    for(int i = 1; i < a.length - 1; i++){
        if(a[i] < min) {
            min = a[i];
        }
        if(a[i + 1] - min > gain) {
            gain = a[i + 1] - min;
        }
    }
    return gain;

}