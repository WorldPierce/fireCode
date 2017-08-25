// Given a doubly-linked list, write a method to delete the node at a given position 
// (starting from 1 as the head position) and return the modified list's head. 
// Do nothing if the input position is out of range.

public DoublyLinkedNode deleteAtPos(DoublyLinkedNode head, int pos) {
    if(head == null) return null;
    if(pos == 1) {
        DoublyLinkedNode newList = head.next;
        head = null;
        return newList;
    }
    DoublyLinkedNode itr = head;
    DoublyLinkedNode prev = head;
    while(itr != null) {
        prev = itr;
        itr = itr.next;
        
        if(--pos == 1) {
            prev.next = itr.next;
            itr = null;
        }
    }
    return head;
}