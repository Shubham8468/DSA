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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        int size=0;
        if(head.next==null){
            return null;
        }
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size%2==0){
            while(fast.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;
            return head;
        }
        else{
            while(fast.next.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;
            return head;
        }
        
    }
}