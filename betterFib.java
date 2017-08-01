// Your goal is to write an optimal method - 
// betterFibonacci that returns the nth Fibonacci number in the sequence. n is 0 indexed,
//  which means that in the sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., 
//  n == 0 should return 0 and n == 3 should return 2. 
//  Your method should exhibit a runtime complexity of O(n) and use constant O(1) space. 
//  With this implementation, 
// your method should be able to compute larger sequences where n > 40.

public static int betterFibonacci(int n) {
    int n2 = 0;
    int n1 = 1;
    if(n == 0) return n2;
    else if (n == 1) return n1;
    int temp = 0;
    for( int i = 2; i <= n; i++) {
        temp = n1 + n2;
        n2 = n1;
        n1 = temp;
    }
    return n1;
}