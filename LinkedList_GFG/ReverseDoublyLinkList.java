class Solution {
    public Node reverse(Node head) {
        // code here
        Node temp = head;
        Node piche = null;
        Node aage = null;
        
        if(head==null || head.next==null)
        {
            return head;
        }
        
        while(temp != null)
        {       
                aage = temp.next;
                temp.next = piche;
                temp.prev = aage;
                piche = temp;
                temp=aage;
        }
        return piche;
    }
