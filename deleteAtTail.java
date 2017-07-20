// Given a singly-linked list, write a method to delete its last node and return the head.

public ListNode deleteAtTail(ListNode head) {
    ListNode ret = head;
    if(head == null || head.next == null){
        return null;
    }
    while(head.next.next != null){
        head = head.next;
    }
    head.next = null;

    return ret;
}