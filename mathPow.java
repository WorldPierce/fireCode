// Write a method - pow(x,n) 
// that returns the value of x raised to the power of n (xn). n can be negative!

public static double pow(double x, int n) {
    double val = 1;
    while(n > 0) {
        val *= x;
        n--;
    }
    while(n < 0) {
        val *= 1/x;
        n++;
    }
    return val;
