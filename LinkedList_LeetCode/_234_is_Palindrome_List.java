public class _234_is_Palindrome_List {
    //Not WORKING 1st wala
                 //Must use 2nd wala
    /*1st method is reverse the given parameter list ,string,whatever and then
    compare the reverse and original one's
      Comparison Logic:
 You are comparing head (the original list) with reversed (the reversed list)
 using if (head != reversed). This checks for reference equality, 
 not whether the two lists have the same values. This will not work as expected.

     For example:

 Original List: head = [1] -> [2] -> [3]
 Reversed List: reversed = [3] -> [2] -> [1]
 When you compare head and reversed, even though the values in both lists 
 are the same, the memory addresses of the nodes are different. 
 Thus, 
 head != reversed
  will always evaluate to true.

  If still I want to do this by reversal
  1. Clone the original list to keep original one unchanged
  2. Reverse the clone List
  3. Compare the values not references of both the list 
  4.If at any point values are mismatched return false otherwise it is true
     Time=O(n)
     Space=O(n)


    2nd --2 POINTER Technique

    1.In this first use slow and fast pointer to find the middle of list
    2.Then reverse the second half of list 
       i.e. from mid to tail
    3.Start comparing the first half of list with the second half until the
      secondhalf finishes or ends
    4. This will have time complexity =) O(n)
                      space           =) O(1)     
     */

     public boolean isPalindrome_1(ListNode head) {
        if (head == null || head.next == null) {
        return true; // An empty or single-node list is a palindrome
    }

    // Step 1: Reverse the entire list
    ListNode reversedHead = reverse(cloneList(head)); // Clone and reverse the list

    // Step 2: Compare values of original and reversed lists
    ListNode original = head;
    ListNode reversed = reversedHead;

    while (original != null && reversed != null) {
        if (original.val != reversed.val) {
            return false; // If values mismatch, not a palindrome
        }
        original = original.next;
        reversed = reversed.next;
    }

    return true; // All values matched
}

// Helper method to reverse a linked list
private ListNode reverse(ListNode head) {
    ListNode prev = null, curr = head, next = null;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

// Helper method to clone a linked list (to avoid modifying the original)
private ListNode cloneList(ListNode head) {
    ListNode dummy = new ListNode(-1);
    ListNode tail = dummy;

    while (head != null) {
        tail.next = new ListNode(head.val);
        tail = tail.next;
        head = head.next;
    }

    return dummy.next;
}

 public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null)
         {
        return true; 
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        //slow is the middle one
        ListNode firstHalf=head;
        ListNode secondHalf=reverse(slow);
        while(secondHalf!=null)
        {
            if(firstHalf.val != secondHalf.val)
            {
                return false;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
      return true;
 }
}
