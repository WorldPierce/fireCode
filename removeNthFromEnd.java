// Given a singly-linked list, remove its Nth from the end node.

public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null || head.next == null) return null;
    int count = 1;
    ListNode itr = head;
    while(itr.next != null) {
        count++;
        itr = itr.next;
    }
    if(n > count) return head;
    count = count - n;
    itr = head;
    if(count <= 1) {
        head = head.next;
        itr = null;
        return head;
    }
    while(count > 1) {
        itr = itr.next;
        count--;
    }
    itr.next = itr.next.next;
    return head;
}