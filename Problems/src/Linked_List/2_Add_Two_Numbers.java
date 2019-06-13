package Linked_List;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * Related Topics: Linked_List, Math
 */

class Add_Two_numbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1, b = l2, result = new ListNode(0), c = result;
        int sum = 0;
        while (a != null || b != null) {
            sum /= 10;
            if (a != null) {
                sum += a.val;
                a = a.next;
            }
            if (b != null) {
                sum += b.val;
                b = b.next;
            }
            c.next = new ListNode(sum % 10);
            c = c.next;
        }
        if (sum / 10 == 1) c.next = new ListNode(1);
        return result.next;
    }
}