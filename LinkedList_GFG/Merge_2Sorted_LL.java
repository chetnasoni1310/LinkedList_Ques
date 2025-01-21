// import java.util.*;
//import java.io.*;



class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
    }
}
public class Merge_2Sorted_LL  {

    
        Node sortedMerge(Node head1, Node head2) {
            // code here
                    Node temp1=head1;
                    Node temp2=head2;
                  
                       Node head=new Node(-1);
                       Node temp3=head;
                   while(temp1!=null && temp2!=null)
                   {
                       if(temp1.data<=temp2.data)
                       {
                           temp3.next=temp1;
                           temp3=temp3.next;
                           temp1=temp1.next;
                       }
                       else{
                           temp3.next=temp2;
                           temp2=temp2.next;
                           temp3=temp3.next;
                       }
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
            public static void main(String[] args) {
                
            }
}