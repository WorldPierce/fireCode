// Find the first non-duplicate character in a string.
// Return null if no unique character is found. 

public static Character firstNonRepeatedCharacter(String str) {
    if(str != null){
    	//or you can use HashMap | TreeMap
        TreeMap<Character,Integer> duplicates = new TreeMap<>();
        for(int i = 0; i < str.length(); i++){
            if(duplicates.containsKey(str.charAt(i))){
                duplicates.put(str.charAt(i), duplicates.get(str.charAt(i)) + 1);
            }
            else {
                duplicates.put(str.charAt(i), 1);
            }
        }
        for(Character key : duplicates.keySet()){
            if(duplicates.get(key) == 1){
                return key;
            }
        }
    }
    
    return null;
}