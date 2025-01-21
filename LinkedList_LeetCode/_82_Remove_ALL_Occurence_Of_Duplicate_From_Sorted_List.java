public class _82_Remove_ALL_Occurence_Of_Duplicate_From_Sorted_List {
    class ListNode 
    {
            int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }

         public ListNode deleteDuplicates(ListNode head) {
            if(head==null || head.next==null)
            {
                return head;
            }
            ListNode dummy=new ListNode(-1);
            dummy.next=head;
            ListNode prev=dummy;
    //         This is how the list will look 
    //         dummy -> 1 -> 1 -> 2 -> 3
    //         prev = dummy
    //         curr = 1
    
    
    //         By using the dummy node, we ensure that we can safely modify the head of the list, even if the head is part of a duplicate sequence.
    // prev.next = curr; is a critical operation that updates the link from prev (initially the dummy node) to the next non-duplicate node (2).
            ListNode curr=head;
            while(curr!=null && curr.next!=null)
            {   
                  boolean isDuplicate = false;
    
                  //check for duplicates 
                  while(curr.next!=null && curr.next.val==curr.val)
                  {
                    isDuplicate=true;
                    curr=curr.next;
                  }
                 
                 if(isDuplicate)
                 {
                    prev.next=curr.next;
                 }
                 else{
                    prev=prev.next;
                 }
                 curr=curr.next;
            }
            return dummy.next;
        }
}
