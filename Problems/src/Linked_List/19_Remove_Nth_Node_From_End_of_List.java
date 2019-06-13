package Linked_List;

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 *
 * Example:
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
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