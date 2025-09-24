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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode ans=new ListNode(0);
        ListNode te=ans;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                te.next=temp1;
                temp1=temp1.next;
            }
            else{
                te.next=temp2;
                
                temp2=temp2.next;
            }
            te=te.next;
        }
        if(temp1==null){
            te.next=temp2;
        }
        else{
            te.next=temp1;
        }

      return ans.next;
        
    }
}