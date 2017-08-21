// Given a doubly linked list, implement a method to insert a node at its head. 
// Return the head of the list.



public DoublyLinkedNode insertAtHead(DoublyLinkedNode head, int data) {
    if(head == null) return new DoublyLinkedNode(data);
    DoublyLinkedNode newHead = new DoublyLinkedNode(data);
    newHead.next = head;
    head.prev = newHead;
    return newHead;
}