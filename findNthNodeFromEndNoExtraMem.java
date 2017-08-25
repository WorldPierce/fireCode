// Given a singly-linked list, implement the method that returns 
// Nth node from the end of the list without using extra memory (constant space complexity).

public ListNode findNthNodeFromEnd(ListNode head, int n) {
    if(head == null) return null;
    int length = 0;
    ListNode curr = head;
    while(curr != null) {
        curr = curr.next;
        length++;
    }
    curr = head;
    length = length - n;
    while(length != 0 && curr != null) {
        curr = curr.next;
        length--;
    }
    return curr;
}