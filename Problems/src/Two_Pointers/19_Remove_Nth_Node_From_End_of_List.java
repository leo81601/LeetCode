package Two_Pointers;

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 *
 * Related Topics: Linked List, Two Pointers
 */

class Remove_Nth_Node_From_End_of_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        while (fast.next != null) {
            if (n <= 0) slow = slow.next;
            fast = fast.next;
            n--;
        }
        if (slow.next != null) slow.next = slow.next.next;
        return dummy.next;
    }
}