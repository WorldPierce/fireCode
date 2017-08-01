// Write a method isAnagram that checks if two lowercase input Strings are anagrams of each other. 
// An anagram of a String is a String that is formed by simply re-arranging its letters,
// using each letter exactly once. 
// Your algorithm should run in linear O(n) time and use constant O(1) space. 

public static boolean isAnagram(String input1, String input2) {
    if(input1 == null || input2 == null) return false;
    if(input1.length() != input2.length()) return false;
    HashMap<Character, Integer> chars = new HashMap<>();
    for(int i = 0; i < input1.length(); i++) {
        if(chars.containsKey(input1.charAt(i))){
            int val = chars.get(input1.charAt(i));
            chars.put(input1.charAt(i), val + 1);
        }
        else {
            chars.put(input1.charAt(i), 1);
        }
        if(chars.containsKey(input2.charAt(i))){
            int val = chars.get(input2.charAt(i));
            chars.put(input2.charAt(i), val - 1);
        }
        else {
            chars.put(input2.charAt(i), -1);
        }
    }
    for (Character character: chars.keySet()) {
        if (chars.get(character) != 0) {
            return false;
        }
    }
    return true;
}