// Given a circular linked list, implement a method to delete its head node. 
// Return the list's new head node.

public ListNode deleteAtHead(ListNode head) {
            if(head == null || head.next == head) return null;
            ListNode delete = head; 
            ListNode newHead = head.next;
            while(head.next != delete) {
                head = head.next;
            }
            head.next = newHead;
            return newHead;
}