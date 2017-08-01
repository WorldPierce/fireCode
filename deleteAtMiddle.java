// Given a singly-linked list, implement a method to delete the node at a given position 
// (starting from 1 as the head position) and return the head of the list. 
// Do nothing if the input position is out of range.



public ListNode deleteAtMiddle(ListNode head, int position) {
        if(head == null) return null;
        if(position == 1) return head.next;
        ListNode remove = head;
        ListNode prev = head;
        int count = 1;
        while(count < position) {
            if(remove.next == null) return head;
            prev = remove;
            remove = remove.next;
            count++;
        }
        if(remove.next != null) {
            prev.next = remove.next;
        }
        else {
            prev.next = null;
        }
        return head;
}