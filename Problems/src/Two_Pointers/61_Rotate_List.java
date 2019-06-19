package Two_Pointers;

/**
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL, k = 2
 * Output: 4->5->1->2->3->NULL
 * Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL
 * rotate 2 steps to the right: 4->5->1->2->3->NULL
 *
 * Related Topics: Linked List, Two Pointers
 */

class Rotate_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        int len = 0;
        while (fast.next != null) {
            fast = fast.next;
            len++;
        }
        for (int i = len - k % len; i > 0; i--) slow = slow.next;
        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;
        return dummy.next;
    }
}