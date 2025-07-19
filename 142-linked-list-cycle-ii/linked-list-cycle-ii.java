/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
       
        if(head==null||head.next==null||head.next.next==null){
            return null;
        }
        while(fast!=null){
            slow=slow.next;
            if(fast.next!=null){
                fast=fast.next.next;
            }
            else{
                return null;
            }
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}