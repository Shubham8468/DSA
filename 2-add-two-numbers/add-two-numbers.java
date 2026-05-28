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
        ListNode temp1=l1,temp2=l2;
       
        int cary=0;
        int data=0;
        ListNode ans=new ListNode(100);
        ListNode an=ans;
        while(temp1!=null || temp2!=null || cary!=0){
            int a=(temp1!=null)? temp1.val : 0;
            int b=(temp2!=null) ? temp2.val :0;
             data=((a+b)+ cary);
            ListNode temp=new ListNode(data%10);
            cary=data/10;
            an.next=temp;
            an=temp;
            if(temp1!=null){
                temp1=temp1.next;
            }
            if(temp2!=null){
                temp2=temp2.next;
            }

        }

        return ans.next;
    }
}