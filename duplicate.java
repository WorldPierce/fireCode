// Write a method duplicate to find the repeated or duplicate elements in an array. 
// This method should return a list of repeated integers in 
// a string with the elements sorted in ascending order (as illustrated below). 


public static String duplicate(int[] numbers){
    Arrays.sort(numbers);
    ArrayList<Integer> dup = new ArrayList<>();
    for(int i = 0; i < numbers.length - 1; i++){
        if(numbers[i] == numbers[i + 1]){
            i++;
            dup.add(numbers[i]);
            int num = numbers[i];
            while(i < numbers.length && num == numbers[i + 1]){
                i++;
            }
        }
    }
    return dup.toString();
}

public static String duplicate2(int[] numbers){
  TreeSet<Integer> result = new TreeSet<Integer>();
  // Sort the array
  Arrays.sort(numbers);
  //Iterate over the array
  for(int i = 1; i < numbers.length; i++) {
      // If previous element is the same as current, its the duplicate element
      if(numbers[i] == numbers[i - 1]) {
          result.add(numbers[i]);
      }
  }
  return result.toString();
}


public static String duplicate3(int[] numbers){
     // Add your code below this line. Do not modify any other code.
    Set<Integer> map = new HashSet<>();
    Set<Integer> list = new TreeSet<>();
    for (int num : numbers) {
        if (map.contains(num)) list.add(num);
        else map.add(num);
    }
    
    return list.toString();
}
