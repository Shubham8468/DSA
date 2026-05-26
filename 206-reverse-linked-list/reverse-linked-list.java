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
      if(head==null || head.next==null){
          return head;
      }
      Stack<Integer> st= new Stack<>();
      ListNode temp=head;
      while (temp!=null){
          st.push(temp.val);
          temp=temp.next;
      }
      ListNode node= new ListNode(100);
      ListNode ans=node;
      while (!st.isEmpty()){
          int data=st.pop();
          ListNode te=new ListNode(data);
          ans.next=te;
          ans=te;
      }
      return node.next;
    }
}