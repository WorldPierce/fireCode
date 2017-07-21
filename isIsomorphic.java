// Given two strings - input1 and input2, determine if they are isomorphic. 

public static boolean isIsomorphic(String input1, String input2) {
    if((input1 == null && input2 != null) || (input2 == null && input1 != null) || (input1.length() != input2.length())) return false;
    HashMap<Character, Integer> one = new HashMap<>();
    HashMap<Character, Integer> two = new HashMap<>();
    
    for(int i = 0; i < input1.length(); i++){
        if(one.containsKey(input1.charAt(i))){
            one.put(input1.charAt(i), one.get(input1.charAt(i) + 1));
        }
        else {
            one.put(input1.charAt(i), 1);
        }
        if(two.containsKey(input2.charAt(i))){
            two.put(input2.charAt(i), two.get(input2.charAt(i) + 1));
        }
        else {
            two.put(input2.charAt(i), 1);
           
        }
        if(two.get(input2.charAt(i)) != one.get(input1.charAt(i))) return false;
    }
    return true;
}