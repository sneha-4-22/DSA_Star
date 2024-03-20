class palindromell{
  public boolean ispalindrome(ListNode head){
    ListNode slow=ListNode(-1);
    slow.next=head;
    ListNode fast=head;
    while(fast!=null&&fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }
    ListNode prev=null;
    ListNode curr=slow.next;
    while(curr!=null){
      ListNode next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    while(prev!=null){
      if(head.val!=prev.val) return false;
      prev=prev.next;
      head=head.next;
    }
    return false;
  } 
}
