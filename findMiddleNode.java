// Given a Singly-Linked List, write a method - 
// findMiddleNode that finds and returns the middle node of the list in a single pass

public ListNode findMiddleNode(ListNode head) {
    if(head == null){
        return null;
    }
    ListNode slow = head;
    ListNode fast = head;
    while(fast.next != null && fast.next.next != null){
        fast = fast.next.next;
        slow = slow.next;
    }
    return slow;
}