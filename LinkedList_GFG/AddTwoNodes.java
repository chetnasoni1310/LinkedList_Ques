public class AddTwoNodes {
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        Node temp1=reverseList(num1);
        Node temp2=reverseList(num2);
        Node dummy =new Node(-1);
        Node temp3=dummy;
      
        int carry=0;
        while(temp1!=null || temp2!=null || carry!=0)
        {   
              int sum=0;
            if(temp1!=null)
            {
                sum+=temp1.data ;
                temp1=temp1.next;
            }
            
             if(temp2!=null)
            {
                sum+=temp2.data;
                temp2=temp2.next;
            }
            
            sum+=carry;
            int val=sum%10;
            carry= sum/10;
            temp3.next = new Node(val);
            temp3=temp3.next;
        }
        temp3=reverseList(dummy.next);
        temp3=removeLeadingZeros(temp3);
        return temp3;
    }
    
    private static Node removeLeadingZeros(Node node)
    {
         while (node != null && node.data == 0 && node.next != null) {
            node = node.next;
        }
        return node;
    }
    private static Node reverseList(Node node)
    {
        if(node==null)
        return node;
        
        
        Node prev=null;
        Node front=null;
        Node curr=node;
        
        while(curr!=null)
        {
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
}
