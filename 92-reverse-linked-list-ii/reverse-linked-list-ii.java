/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
   public ListNode reverseBetween(ListNode head, int left, int right) {
    if (head == null || head.next == null) return head;

    // dummy node handles the edge case where left = 1
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    // Step 1: Move prevLeft to the node just BEFORE position 'left'
    ListNode prevLeft = dummy;
    for (int i = 1; i < left; i++) {
        prevLeft = prevLeft.next;
    }

    // Step 2: curr starts at position 'left'
    ListNode curr = prevLeft.next;
    ListNode prev = null;
    ListNode nextNode = null;

    // Step 3: Reverse (right - left + 1) nodes
    for (int i = 0; i <= right - left; i++) {
        nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;
    }

    // Step 4: Reconnect
    // prevLeft.next is still pointing to old 'left' node (now the tail of reversed)
    prevLeft.next.next = curr;   // tail of reversed → node after 'right'
    prevLeft.next = prev;        // node before 'left' → new head of reversed

    return dummy.next;
}
}