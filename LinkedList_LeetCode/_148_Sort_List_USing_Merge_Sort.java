public class _148_Sort_List_USing_Merge_Sort{
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=middleNode(head);
        ListNode right=sortList(mid.next);
        mid.next=null;
        ListNode left=sortList(head);

        return mergeTwoLists(left,right);
    }
    public ListNode middleNode(ListNode head) {

        //Method 1 
      /*   int middle= length(head) /2;
        return getNode(head,middle);  */

        ListNode slow=head;
        // ListNode fast=head;  //Use this if we want to find the 2nd middle node in case of even
        ListNode fast=head.next; //Use this if we want to find the 1st middle node in case of even
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }

          return slow;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode(-1);
        ListNode temp3=head;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<=temp2.val)
            {
                 temp3.next=temp1;
                 temp1=temp1.next;
            }
            else{
                 temp3.next=temp2;
                 temp2=temp2.next;
            }
                 temp3=temp3.next;
        }
        if(temp1!=null)
        {
            temp3.next=temp1;
        }
        if(temp2!=null)
        {
            temp3.next=temp2;
        }
        return head.next;
    }
}