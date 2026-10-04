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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        int data=0;
        int carry=0;
        ListNode ans=new ListNode(0);
        ListNode an=ans;
        while(t1!=null || t2!=null || carry!=0){
            int a=(t1!=null)? t1.val :0;
            int b=(t2!=null)? t2.val :0;
            data=(a+b)+carry;
            ListNode temp=new ListNode(data%10);
            an.next=temp;
            an=temp;
            carry=data/10;
            if(t1!=null){
                t1=t1.next;
            }
            if(t2!=null){
                t2=t2.next;
            }
        }
        return ans.next;
        
    }
}