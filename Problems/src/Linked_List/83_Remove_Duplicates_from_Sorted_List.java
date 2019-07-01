package Linked_List;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example:
 *
 * Input: 1->1->2
 * Output: 1->2
 *
 * Related Topics: Linked List
 */

class Remove_Duplicates_from_Sorted_Array {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.next.val == node.val) {
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
        return head;
    }
}