package Linked_List;

/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 *
 * Example:
 *
 * Input: 1->2->3->3->4->4->5
 * Output: 1->2->5
 *
 * Related Topics: Linked List
 */

class Remove_Duplicates_from_Sorted_List_II {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = dummy;
        while (node.next != null && node.next.next != null) {
            if (node.next.val == node.next.next.val) {
                int number = node.next.val;
                while (node.next != null && node.next.val == number) node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
        return dummy.next;
    }
}