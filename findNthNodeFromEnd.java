// Given a singly-linked list, implement the method that returns Nth node from the end of the list. 
// You are allowed to use extra memory for this implementation.

public ListNode findNthNodeFromEnd(ListNode head, int n) {
    if(head  == null) return null;
    Hashtable<Integer, ListNode> nodes = new Hashtable<>();
    int length = 1;
    while(head != null) {
        nodes.put(length, head);
        head = head.next;
        length++;
    }
    return nodes.get(length - n);
}