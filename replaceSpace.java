// Write a method to replace all spaces in a string with a given replacement string. 

public static String replace(String a, String b) {

    ArrayList<String> wordList = new ArrayList<>(Arrays.asList(a.split(" ")));
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < wordList.size() - 1; i++){
            sb.append(wordList.get(i));
            sb.append(b);
    }
    sb.append(wordList.get(wordList.size() - 1));
    return sb.toString();
}

//char step through
public static String replace2(String a, String b) {
	StringBuilder builder = new StringBuilder();
	for(int i = 0; i < a.length(); i++){
	    char c = a.charAt(i);
	    if(c == ' ') builder.append(b);
	    else builder.append(c);
	}
	return builder.toString();

// Add your code above this line. Do not modify any other code.
}