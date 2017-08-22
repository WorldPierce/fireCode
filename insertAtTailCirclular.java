// Given a circular linked list, write a method to insert a node at its tail. Return the list's head.

public ListNode insertAtTail(ListNode head, int data) {
    if(head == null){
        ListNode newHead = new ListNode(data);
        newHead.next = newHead;
        return newHead;
    } 
    ListNode insert = new ListNode(data);
    ListNode itr = head;;
    //ListNode prev = itr;
    while(itr.next != head) {
        //prev = itr;
        itr = itr.next;
    }
    insert.next = itr.next;
    itr.next = insert;
    return head;
}