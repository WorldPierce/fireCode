// Write a method to determine whether a postive number is Happy.
// Beginning with the number itself, replace it by the sum of the squares of its digits until 
// either the number becomes 1 or loops endlessly in a cycle that does not include 1.
public static boolean isHappyNumber(int n) {
    ArrayList<Integer> seen = new ArrayList<>();
    int target = 0;
    while(!seen.contains(n)) {
        seen.add(n);
        while(n != 0) {
            int num = n % 10;
            n = n / 10;
            target += Math.pow(num,2);
        }
        if(target == 1) return true;
        n = target;
        target = 0;
    }
    return false;
}