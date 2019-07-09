package Linked_List;

/**
 * Reverse a linked list from position m to n. Do it in one-pass.
 *
 * Note: 1 ≤ m ≤ n ≤ length of list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL, m = 2, n = 4
 * Output: 1->4->3->2->5->NULL
 *
 * Related Topics: Linked List
 */

class Reverse_Linked_List_II {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode begin = dummy;
        for (int i = 1; i < m; i++) begin = begin.next;
        ListNode current = begin.next;
        for (int i = m; i < n; i++) {
            ListNode temp = current.next.next;
            current.next.next = begin.next;
            begin.next = current.next;
            current.next = temp;
        }
        return dummy.next;
    }
}