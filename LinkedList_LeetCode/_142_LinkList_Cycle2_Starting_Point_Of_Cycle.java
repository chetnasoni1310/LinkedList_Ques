public class _142_LinkList_Cycle2_Starting_Point_Of_Cycle {


    public ListNode detectCycle(ListNode head) {
      
        ListNode MeetingNode=get_Meeting_Node(head);
        if(MeetingNode==null)
        {
            return null;
        }
        int length_of_cycle=lengthOf_cycle(MeetingNode);
        ListNode fast=head;
        ListNode slow=head;

        while(length_of_cycle-->0)
        {
            slow=slow.next;
        }
        do{
            slow=slow.next;
            fast=fast.next;
        }while(fast!=slow);

        return fast;
    }



    public ListNode  get_Meeting_Node(ListNode head) {  
        if(head==null || head.next==null)
        {
            return null;
        }
        ListNode slow=head;        //Tortoise
        ListNode fast=head;   //Hare

        while(fast!=null && fast.next!=null)
        {
            
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                return fast;
            }
        }
       return null;
}

    public int lengthOf_cycle(ListNode Meeting_Point)
    {
         int length=0;
         ListNode slow=Meeting_Point;
         ListNode fast=Meeting_Point;

        do{  
            slow=slow.next;
            length++;
        }while(slow!=fast);
        return length;
    }

}
