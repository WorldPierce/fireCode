// Write a method that checks if a given integer is a palindrome

public static Boolean isIntPalindrome(int x) {            
    if(x < 10 && x > 0) return true;
    String myInt = Integer.toString(x);
    for(int i = 0, j = myInt.length() - 1; i < j; i++, j--) {
        if (myInt.charAt(i) != myInt.charAt(j) ) {
            return false;
        }
    }
    return true;
}