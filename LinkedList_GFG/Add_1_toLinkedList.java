public class Add_1_toLinkedList {
    public Node addOne(Node head) {
        // code here.
        Node temp1=reverseList(head);
   
        Node dummy =new Node(-1);
        Node temp3=dummy;
     
         
        int carry=0;
       
        boolean AddOne=false;
        
        while(temp1!=null || carry!=0)
        {   
            int sum=0;
            
            if(!AddOne)
            {
               sum = temp1.data + 1;
               carry=sum/10;
               temp3.next=new Node(sum%10);
               temp3=temp3.next;
               temp1=temp1.next ;
               AddOne=true;
               sum=0;
            }
            
            if(temp1!=null  && AddOne)
            {
                sum+=temp1.data ;
                temp1=temp1.next;
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
