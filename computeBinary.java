// Write a method to compute the binary representation of a positive integer. 
// The method should return a string with 1s and 0s. 

public static String computeBinary(int val) {
    StringBuilder sb = new StringBuilder();
    if(val < 2) {
        sb.append(Integer.toString(val));
    }
    else {
        sb.append(computeBinary(val / 2));
        sb.append(computeBinary(val % 2));
    }
    return sb.toString();
}