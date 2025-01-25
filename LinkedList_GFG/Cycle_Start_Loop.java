public class Cycle_Start_Loop{
public static Node findFirstNode(Node head) {
    // code here
    Node slow=head;
    Node fast=head;
    do{
        slow=slow.next;
        fast=fast.next.next;
    }while(fast!=slow && fast!=null && fast.next!=null);
    
    if(fast==null || fast.next==null)
    {
        return new Node(-1);
    }
    fast=head;
    while(fast!=slow)
    {
        slow=slow.next;
        fast=fast.next;
    }
    return slow;
}
}