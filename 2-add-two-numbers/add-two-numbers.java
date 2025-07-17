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
        ListNode res=new ListNode(10);
        ListNode curr=res;
        int va=0,carry=0;
        while(p!=null||q!=null||carry!=0){
            int data1=(p==null)?0:p.val;
            int data2=(q==null)?0:q.val;
            va=data1+data2+carry;
            ListNode temp=new ListNode(va%10);
            curr.next=temp;
            curr=temp;
            carry=va/10;
            if(p!=null){
                p=p.next;
            }
            if(q!=null){
                q=q.next;
            }
        }
        return res.next;
        
    }
}