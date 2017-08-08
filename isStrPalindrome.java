public static boolean isStringPalindrome(String str){
    if(str == null) return true;
    //str = str.replaceAll("\\s", ""); removes all spaces
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString().equals(str);
}