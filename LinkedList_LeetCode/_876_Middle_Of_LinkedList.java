public class _876_Middle_Of_LinkedList {
    public ListNode middleNode(ListNode head) {

        //Method 1 
      /*   int middle= length(head) /2;
        return getNode(head,middle);  */

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }

          return slow;
    }
    private ListNode getNode(ListNode head,int k)
    {
        ListNode temp=head;
        while(temp!=null && k>0)
        {
            temp=temp.next;
            --k;
        }
        return temp;
    }
    private int length(ListNode head)
    {
        ListNode temp=head;
        int length=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            length++;
        }
        return length;
    }



}
