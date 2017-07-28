// Given a circular-linked list, write a function to delete 
// its tail node and return the modified list's head

public ListNode deleteAtTail(ListNode head) {
    if (head == null || head.next == head) return null;
    ListNode tail = head;
    while(tail.next.next != head) {
        tail = tail.next;
    }
    tail.next = head;
    return head;
}