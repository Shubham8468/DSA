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
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        if(temp==null||temp.next==null||temp.next.next==null){
            return false;
        }
        while(fast!=null){
            if(fast.next!=null){
                fast=fast.next.next;
            }
            else{
                return false;
            }
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
        
    }
}