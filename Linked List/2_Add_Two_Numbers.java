/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * Related Topics: Linked List, Math
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1, b = l2, result = new ListNode(0), c = result;
        int sum = 0;
        while (a != null || b != null) {
            sum /= 10;
            if (a != null) {
                sum += a;
                a = a.next;
            }
            if (b != null) {
                sum += b;
                b = b.next;
            }
            c.next = new ListNode(sum % 10);
            c = c.next;
        }
        if (sum / 10 = 1) c.next = new ListNode(1);
        return result.next;
    }
}