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
    public int lengh(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l=lengh(head);
       if(n==1 && l==1 ||l==0){
        return null;
       }
       
       int rev=l-n;
       if(rev==0){
        return head.next;
       }
       ListNode temp=head;
       for(int i=1;i<rev;i++){
           temp=temp.next;
       }
       if(n==1&&temp.next.next==null){
              temp.next=null;
              return head;
       }
       temp.next=temp.next.next;
       return head;
        
    }
}