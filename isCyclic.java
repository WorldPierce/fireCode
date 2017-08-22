// Given a singly-linked list, implement a method to check if the list has cycles. 
// The space complexity can be O(n). If there is a cycle, return true otherwise return false. 
// Empty lists should be considered non-cyclic.

public Boolean isCyclic(ListNode head) {
    if(head == null) return false;
    int temp = head;
    Hashtable<Integer, ListNode> cycle = new Hashtable<>();
    while(temp != null) {
        if(cycle.get(temp.data) != null) {
            return true;
        }
        cycle.put(temp.data, temp);
        temp = temp.next;
    }
    return false;
}