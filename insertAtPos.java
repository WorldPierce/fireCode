// In doubly linked list, implement a method to insert a node at specified position and 
// return the list's head. 
// Do nothing if insertion position is outside the bounds of the list.

public DoublyLinkedNode insertAtPos(DoublyLinkedNode head, int data, int pos) {
    if(head == null && pos == 1) return new DoublyLinkedNode(data);
    if(pos == 1) {
        DoublyLinkedNode newData = new DoublyLinkedNode(data);
        newData.next = head;
        head.prev = newData;
        return newData;
    }
    DoublyLinkedNode insertBefore = head;
    DoublyLinkedNode newData = new DoublyLinkedNode(data);
    while(insertBefore != null) {
        pos--;
        if(pos == 0) {
            newData.prev = insertBefore.prev;
            if(insertBefore.prev != null) {
                insertBefore.prev.next = newData;
            }
            newData.next = insertBefore;
            break;
        }
        else if(pos == 1 && insertBefore.next == null) {
            insertBefore.next = newData;
            newData.prev = insertBefore;
            break;
        }
        insertBefore = insertBefore.next;
    }
    return head;
}