// Given a singly-linked list, remove duplicates in the list and return head of the list. 
// Target a worst case space complexity of O(n).

public ListNode removeDuplicates(ListNode head) {
    
        ListNode itr = head;
        ListNode prev = head;
        ArrayList<Integer> checkDuplicate = new ArrayList<>();
        while(itr != null) {
            if(checkDuplicate.contains(itr.data)) {
                prev.next = itr.next;
            } else {
                checkDuplicate.add(itr.data);
            }
            
            prev = itr;
            itr = itr.next;
        }
        return head;
}