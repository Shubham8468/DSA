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
    public ListNode reverseList(ListNode head) {
        ListNode temp= head;
        Stack<Integer> st= new Stack<>();
        while(temp!=null){
            if(temp!=null)st.push(temp.val);
            temp=temp.next;
        }
        ListNode te=head;
        while(!st.isEmpty()){
            te.val=st.pop();
            te=te.next;
        }
        return head;
    }
}