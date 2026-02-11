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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode priv=null;
        ListNode temp=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=priv;
            priv=curr;
            curr=temp;
        }
        return priv;
    }
}