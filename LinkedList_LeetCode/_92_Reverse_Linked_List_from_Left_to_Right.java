public class _92_Reverse_Linked_List_from_Left_to_Right {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right)
        {
            return head;
        }

        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode end=getNode(head,right);
        ListNode prev_to_left=dummy;
        for(int i=1;i<left;i++)
        {
            prev_to_left=prev_to_left.next;
        }
        ListNode start=prev_to_left.next;

        //Use 3-POINTERS approach
        ListNode curr=start;
        ListNode prev=null;
        ListNode front=null;
        for(int i=left;i<=right;i++)
        {
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
      
         prev_to_left.next=end;
         start.next=curr;
         return dummy.next;
    }
     public ListNode getNode(ListNode head,int index)
    {
         ListNode temp=head;
         while(index>1 && temp!=null)
         {
            temp=temp.next;
            index--;
         }
         return temp;
    }
}
