package Linked_List;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 *
 * Example:
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */

class Swap_Nodes_in_Pairs {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy, fast = head;
        dummy.next = head;
        while (fast != null && fast.next != null) {
            ListNode nextTwo = fast.next.next;
            slow.next = fast.next;
            slow.next.next = fast;
            fast.next = nextTwo;
            slow = fast;
            fast = fast.next;
        }
        return dummy.next;
    }
}