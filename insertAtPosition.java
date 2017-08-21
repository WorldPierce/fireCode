// Given a singly-linked list, implement a method to insert a node at a specific position and
// return the head of the list.
// If the given position is greater than the list size, simply insert the node at the end.

public ListNode insertAtPosition(ListNode head, int data, int pos) {
    if(head == null) return new ListNode(data);
    if(pos == 1) {
        ListNode newHead = new ListNode(data);
        newHead.next = head;
        return newHead;
    }
    ListNode curr = head;
    ListNode prev = curr;
    while(curr.next != null) {
        if(pos-- == 1) {
            ListNode entry = new ListNode(data);
            prev.next = entry;
            entry.next = curr;
            return head;
        }
        prev = curr;
        curr = curr.next;
    }
    curr.next = new ListNode(data);
    return head;
}