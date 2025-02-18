import java.util.HashSet;

public class Intersection_of_LL_FromHead1 {
  public Node findIntersection(Node head1, Node head2) {
        // add your code here
        
        /*
        Key observations:
        1. First of all I will Store all the elements of head2 in hashset
        2. then for every element of head1 i will look up in the step if it do exist
        3. if it does then add it to my resultant
        4. if not then move forward
        */
        
        //Edge-Case
        if(head1==null || head2==null)
        return null;
        
        
        HashSet<Integer> List2Values=new HashSet<>();
       
       Node result=new Node(-1);
       Node tempResult=result;
        
        Node temp1=head1;
        Node temp2=head2;
        
        while(temp2!=null)
        {
            List2Values.add(temp2.data);
          
            temp2=temp2.next;
        }
        
        while(temp1!=null)
        {
          if(List2Values.contains(temp1.data))  
          {
              tempResult.next=new Node(temp1.data);
              tempResult=tempResult.next;
          }
          temp1=temp1.next;
        }
        
        return result.next;
    }
}
