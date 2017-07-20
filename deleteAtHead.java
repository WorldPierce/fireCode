// Given a singly-linked list, 
// write a method to delete the first node of the list and return the new head.

public ListNode deleteAtHead(ListNode head) {    
      if(head == null) return null;
      //store head.next in temp variable so that we can reference it later
      ListNode temp = head.next;        
      //detach head from the list
      head.next = null;
      //set next ListNode stored in temp variable as a new head.
      head = temp;              
      return head;
  }

  public ListNode deleteAtHead2(ListNode head) {
    if(head == null){
        return null;
    }
    return head.next;    
}