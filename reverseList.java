// Given the head pointer of a singly linked list, 
// implement a method to reverse the list and return the new head.

public ListNode reverseList(ListNode head) {
    if(head == null) return null;
    ListNode prev = null;
    while(head != null) {
        ListNode front = prev;
        
        prev = new ListNode(head.data);
        prev.next = front;
        head = head.next;
        
    }
    return prev;



}