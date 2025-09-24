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
        ListNode p=l1,q=l2;
        ListNode ans=new ListNode(0);
        ListNode curr=ans;
        int valu=0;
        int carry=0;
        while(p!=null || q!=null || carry !=0){
            int lData=(p==null)?0 :p.val;
            int l2Data=(q==null)?0 : q.val;
            valu=lData+l2Data+carry;
            ListNode temp=new ListNode(valu%10);
            curr.next=temp;
            curr=temp;
            carry=valu/10;
            if(p!=null){
                p=p.next;
            }
            if(q!=null){
                q=q.next;
            }

        }
        return ans.next;
    }
}