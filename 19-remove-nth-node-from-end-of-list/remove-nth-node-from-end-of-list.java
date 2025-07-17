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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null&&n==1){
            return null;
        }
        if(head.next.next==null){
            if(n==1){
                head.next=null;
                return head;
            }
            else{
                return head.next;
            }
        }
        int le=0;
        ListNode temp=head;
        while(temp!=null){
            le++;
            temp=temp.next;
        }
        int steps=le-n;
        if(steps==0){
            return head.next;
        }
        ListNode te=head;
        for(int i=1;i<steps;i++){
            te=te.next;
        }
        te.next=te.next.next;
        return head;

        
    }
   
}
