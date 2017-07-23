// Implement a method that checks if two strings are permutations of each other

public static boolean permutation(String str1, String str2) {
    if(str1.length() != str2.length() || str1 == null || str2 == null) return false;
     Hashtable<Character,Integer> numbers = new Hashtable<Character,Integer>();
    for(int i = 0; i < str1.length(); i++){
        if(str2.indexOf(str1.charAt(i)) == -1){
            return false;
        }
        int count = numbers.containsKey(str1.charAt(i)) ? numbers.get(str1.charAt(i)) : 0;
        numbers.put(str1.charAt(i), count + 1);
        int count2 = numbers.containsKey(str2.charAt(i)) ? numbers.get(str2.charAt(i)) : 0;
        numbers.put(str2.charAt(i), count2 + 1);
    }
    Set<Character> keys = numbers.keySet();
    for(Character key : keys){
        if((numbers.get(key) % 2) != 0){
            return false;
        }
    }
    return true;
}