public class Insertion_in_Sorted_Circular_LinkedList {
    public static void main(String[] args) {
        
    }
    public Node sortedInsert(Node head, int data) {
        // code here
        Node temp = head ;
      
        Node newnode = new Node(data);
        
          // If the list is empty, create a self-looped node and return it
        if (head == null) {
            newnode.next = newnode;
            return newnode;
        }
        
        if(temp.data >= data)
        {
            newnode.next = head;
         
            //Ab head aur tail ko connect krna hai 
            while(temp.next != head)
            {
                temp=temp.next;
            }
            temp.next = newnode ;
            
            return newnode;
        }
        
        else{
            Node prev = temp;
            temp = temp.next;
            while(temp.next!= head || temp.data >= data)
            {
                if(temp.data >= data)
                {
                  prev.next = newnode ;
                  newnode.next = temp;
                 return head;
                }
                else
                {
                    temp = temp.next;
                    prev = prev.next;
                }
            }
          
           temp.next = newnode ;
           newnode.next = head ;
           return head;
        }
        
        
    }
}
