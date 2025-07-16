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
    public int lenght(ListNode head){
        ListNode temp=head;
        int count=1;
       while(temp.next!=null){
        count++;
        temp=temp.next;
       }
       return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        int le=lenght(head);
        int n=k%le;
        ListNode temp=head;
        while(n>0){
            while(temp.next.next!=null){
                temp=temp.next;
            }
            ListNode te=temp.next;
            te.next=head;
            temp.next=null;
            head=te;
            temp=head;
            n--;
        }
        return head;
    }
}