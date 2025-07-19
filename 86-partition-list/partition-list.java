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
    public ListNode partition(ListNode head, int x) {
        if(head==null){
            return null;
        }
        ListNode small=new ListNode(0);
        ListNode sm=small;
        ListNode higher=new ListNode(0);
        ListNode hi=higher;
        while(head!=null){
            if(head.val<x){
                sm.next=head;
                sm=sm.next;
            }
            else{
                hi.next=head;
                hi=hi.next;
            }
            head=head.next;
        }
        hi.next=null;
        sm.next=higher.next;
        return small.next;

        
    }
}