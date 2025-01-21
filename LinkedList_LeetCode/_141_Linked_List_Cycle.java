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

    public int lengthOf_cycle(ListNode head,ListNode Meeting_Point)
    {
         int length=0;
         ListNode slow=Meeting_Point;
         ListNode fast=Meeting_Point;

        do{   
            length++;
            slow=slow.next;
        }while(slow!=fast);
        return length;
    }
}
