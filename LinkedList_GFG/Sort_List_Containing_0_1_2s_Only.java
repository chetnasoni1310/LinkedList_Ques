public class Sort_List_Containing_0_1_2s_Only {
 // Function to sort a linked list of 0s, 1s and 2s.
 static Node segregate(Node head) {
    // add your code here
    
    /*Dekho pehle ek toh brute force approach hai ki 
     counter of 0,1,2 banao 
     List ko traverse karo aur counters increase krte jao jab temp tail tk
     poch jaaye toh ruk jao
     fir dobara temp ko start kro 
     counter 0jab tak khaali nahi ho jata 
     temp mai data update krdo 
     fir conter 1 ko khtm kro
     fir counter 2 ko khtm kro 
     last m temp tail tk aayega aur sab sort ho jayegaa
     
     
     
     
     
     Fir aati h
     *****************OPTIMAL APPROACH*****************
     ismai hum kya karenge ki
     3 dummy nodes banayenge for 0 , 1 and 2
     then temp ko start krege agar uski value
                    0 hui toh zero vaale se connect
                    1 hui toh one vaale se connect
                    2 hui toh two vaale se connect
                    
    Fir last mai zero ke end ko 1 ke start se connect
    1 ke end ko 2 ke start se connect
    
    fir sorted list milegi
    
     */
     if(head==null || head.next==null)
     {
         return head;
     }
    Node dummy0=new Node(-1);
    Node dummy1=new Node(-1);
    Node dummy2=new Node(-1);
    
    
    Node zero=dummy0;
    Node one=dummy1;
    Node two=dummy2;
    
    Node temp=head;
    while(temp!=null)
    {
        if(temp.data ==0)
        {
            zero.next=temp;
            zero=zero.next;
        }
        else if(temp.data ==1)
        {
            one.next=temp;
            one=one.next;
        }
        else
        {
            two.next=temp;
         
            two=two.next;
        }
        temp=temp.next;
    }
    zero.next= (dummy1.next!=null) ? dummy1.next: dummy2.next;
    one.next=dummy2.next;
    two.next=null;
    return dummy0.next;
}
}
