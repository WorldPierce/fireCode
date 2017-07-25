// Given a List of Strings, write a method removeDuplicates that removes duplicate words from the List and returns an ArrayList of all the unique words. 
// The returned ArrayList should be lexically alphabetically.

public static ArrayList<String> removeDuplicates(List<String> input) {
    if (input == null) return null;
    Collections.sort(input);
    ArrayList<String> unique = new ArrayList<>();
    for(int i = 0; i < input.size(); i++) {
        if(unique.indexOf(input.get(i)) == -1) {
            unique.add(input.get(i));
        }
    }
    return unique;
}

//alt use TreeSet which sorts and removes doubles automatically

public static ArrayList<String> removeDuplicates2(List<String> input) {
    return new ArrayList<>(new TreeSet<>(input));
}