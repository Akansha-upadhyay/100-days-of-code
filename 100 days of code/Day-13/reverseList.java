<<<<<<< HEAD
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode nextTemp = curr.next; // save next node
            curr.next = prev;              // reverse pointer
            prev = curr;                   // move prev forward
            curr = nextTemp;               // move curr forward
        }

        return prev; // new head
    }
}
=======
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode nextTemp = curr.next; // save next node
            curr.next = prev;              // reverse pointer
            prev = curr;                   // move prev forward
            curr = nextTemp;               // move curr forward
        }

        return prev; // new head
    }
}
>>>>>>> 64be3a6 (Day 14: Solve Longest Palindromic Substring using Expand Around Center)
