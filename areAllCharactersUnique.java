// Write a method that takes in an input String and returns true if all the characters in the 
// String are unique and false if there is even a single repeated character.

public static boolean areAllCharactersUnique(String str){
    if(str != null){
        ArrayList<Character> unique = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if(unique.contains(str.charAt(i))){
                return false;
            }   
        unique.add(str.charAt(i));
        }
    }
    return true;
}

//with HashSet - add in hashset returns bool
public static boolean areAllCharactersUnique2(String str){
    if(str == null) return true;
    HashSet<Character> hs = new HashSet<Character>();
    for(int i = 0; i < str.length(); i++) {
        if(!hs.add(str.charAt(i))) {
            return false;
        }
    }
    return true;
}