// Compress a sorted String by replacing instances of repeated characters with the 
// character followed by the count of the character.


public static String compressString(String str) {
    if (str == null || str.length() < 2) return str;
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < str.length(); i++) {
        if( i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)){
            int count  = 2;
            i++;
            char letter = str.charAt(i);
            while( i + 1 < str.length() && letter == str.charAt(i + 1)){
                count++;
                i++;
            }
            sb.append(letter);
            sb.append(count);
        }
        else {
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}