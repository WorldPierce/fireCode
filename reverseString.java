// Write a method that takes in a String and returns the reversed version of the String
// Use StringBuilder to save time/consume less energy on string concat

public static String reverseString(String str){
    String inputString = str;
    String outputString = null;
    StringBuilder sb = new StringBuilder();
    if(inputString != null) {
        
        for(int i = inputString.length() - 1; i >=0; i--){
            sb.append(inputString.charAt(i));
        }
        outputString = sb.toString();
    }
    
    return outputString;
}


//review solution

public static String reverseString(String str){
    if(str == null || str.length() <= 1) {
        return str;
    }
    return new StringBuilder(str).reverse().toString();
}