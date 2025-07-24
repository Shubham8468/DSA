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
    public int le(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode oddEvenList(ListNode head) {
        int lenght=le(head);
        ListNode t=new ListNode(1);
        ListNode te=new ListNode(0);
        ListNode odd=t,even=te,tem=head;

        for(int i=1;i<=lenght;i++){
            if(i%2!=0){
                odd.next=tem;
                odd=tem;
                tem=tem.next;
            }
            else{
                even.next=tem;
                even=tem;
                tem=tem.next;
            }
        }
        even.next=null;
        odd.next=te.next;
        return t.next;
    }
}
