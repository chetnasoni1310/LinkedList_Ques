import java.util.*;
//import java.io.*;

// import org.w3c.dom.Node;


class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
    }
}
public class Reverse_Singly_LL {
  Node reverseList(Node head) {
        // code here
        
      //Brute force app is using stack 
      //first push it into the stack
      //then pop out and replace the old value with stack's top 
      //then pop out from stack
      
      
      //   --->>>3---- Pointer Approach ---->>>
    //     if(head==null || head.next==null)
    //   {
    //       return head;
    //   }
      
    //   Node temp=head;
    //   Node prev=null;
    //   Node nextt=null;
      
    //   while(temp!=null)
    //   {
    //       nextt=temp.next;
    //       temp.next=prev;
    //       prev=temp;
    //       temp=nextt;
    //   }
    //  return prev;
    
    
    //Using Reccursion 
     if(head==null || head.next==null)
      {
          return head;
      }
      Node newnode=reverseList(head.next);
     
     Node front=head.next;
     front.next=head;
     head.next=null;
     
     return newnode;

    
    }

public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}