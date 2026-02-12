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
    public int length(ListNode temp){
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;

        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l= length(head);
        int steps=l-n;
        if(steps==0){
            return head.next;
        }
        ListNode temp=head;
        for(int i=1;i<steps;i++){
           temp=temp.next;
        }
        if(temp.next.next==null){
            temp.next=null;
        }
        else{
        temp.next=temp.next.next;
        }
        return head;
      



    }
}