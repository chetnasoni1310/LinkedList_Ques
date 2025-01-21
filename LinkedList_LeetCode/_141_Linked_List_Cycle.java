public class _141_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
        {
            return false;
        }
        ListNode slow=head;        //Tortoise
        ListNode fast=head.next;   //Hare
   
        while(fast!=null && fast.next!=null)
        {   
            if(fast==slow)
            {
                return true;
            }
          
            fast=fast.next.next;
            slow=slow.next;
        }
        return false;
    }
}
