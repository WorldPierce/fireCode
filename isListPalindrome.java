// Given a singly-linked list, write a method isListPalindrome to determine if the list is a palindrome. 
// A palindrome is a sequence that reads the same backward as forward.

public Boolean isListPalindrome(ListNode head) {
    if(head == null || head.next == null) return true;
    ArrayList<Integer> forward = new ArrayList<>();
    ArrayList<Integer> reverse = new ArrayList<>();
    while(head != null) {
        forward.add(head.data);
        reverse.add(0,head.data);
        head = head.next;
    }
    return forward.equals(reverse);
}