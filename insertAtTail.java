// Write a method to insert a node at the end of a singly-linked list. 
// Return the head of the modified list

public ListNode insertAtTail(ListNode head, int data) {
    if(head == null) return new ListNode(data);
    ListNode end = head;
    while(end.next != null){
        end = end.next;
    }
    ListNode next = new ListNode(data);
    end.next = next;
    return head;
}