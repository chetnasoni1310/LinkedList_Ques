public class _2_Add_2Lists {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
       ListNode temp1=l1;
       ListNode temp2=l2;
       ListNode result=new ListNode(-1);
       ListNode temp3=result;
       while(temp1!=null || temp2!=null || carry!=0)
       {
             int sum=0;
           if(temp1!=null)
           {
               sum+=temp1.val ;
               temp1=temp1.next;
           }
           
            if(temp2!=null)
           {
               sum+=temp2.val;
               temp2=temp2.next;
           }
           
           sum+=carry;
           int value=sum%10;
           carry= sum/10;
           temp3.next = new ListNode(value);
           temp3=temp3.next;
       }
    
      
       return result.next;
   }
}
