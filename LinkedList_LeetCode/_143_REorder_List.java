public class _143_REorder_List {
    //     The slow and fast pointer technique ensures that finding the 
//     middle takes O(n).
//  Reversing the second half and merging both halves alternately 
//  can also be done in O(n)
//  O(1) space complexity, as you're only rearranging the nodes.
public void reorderList(ListNode head) {
    if(head.next==null || head==null)
    {
        return;
    }
    ListNode mid=getMiddle(head);
    ListNode secondHalf=reverse(mid.next);
    mid.next=null;
    ListNode firstHalf=head;

    /*iski vjh se TLE aa rha hai iski vjh dusri approach use kii hai niche  */
    // boolean addingSecond=true;
    // boolean addingFirst=false;
    // while(secondHalf!=null && firstHalf!=null)
    // {   
    //     if(addingSecond)
    //     {
    //     firstHalf.next=secondHalf;
    //     addingSecond=false;
    //     addingFirst=true;
    //     firstHalf=firstHalf.next;
    //     }

    //     //  if(addingFirst)
    //     else
    //     {
    //     secondHalf.next=firstHalf;
    //     addingFirst=false;
    //     addingSecond=true;
    //     secondHalf=secondHalf.next;
    //     }
    // }

    while(secondHalf!=null)  //ya toh barabar honge ya firstHalf bada hoga
                            // toh pehle 2nd wala khtm hoga
    {
        ListNode temp1=firstHalf.next;
        ListNode temp2=secondHalf.next;

       firstHalf.next=secondHalf;
       secondHalf.next=temp1;
    
      firstHalf=temp1;
      secondHalf=temp2; 
    }
  return;
}
public ListNode reverse(ListNode head)
{
    ListNode temp=head;
    ListNode prev=null;
    ListNode front=null;
    while(temp!=null)
    {
        front=temp.next;
        temp.next=prev;
        prev=temp;
        temp=front;
    }
    return prev;
}
public ListNode getMiddle(ListNode head)
{
    ListNode fast=head.next;
    ListNode slow=head;
    while(fast!=null && fast.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
    }
    return slow;
}
}
