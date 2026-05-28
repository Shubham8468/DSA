/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode t1= headA;
      ListNode t2=headB;
      int h1 = height(t1);
      int h2=height(t2);
      t1=headA;
      t2=headB;
      if(h1 > h2){
          for (int i = 1; i <=h1-h2 ; i++) {
              t1 = t1.next;
          }
      }
      if(h2>h1){
          for (int i = 1; i <=h2-h1 ; i++) {
              t2 = t2.next;
          }
      }
      while(t1!=t2){
        t1=t1.next;
        t2=t2.next;
      }
      return t1;

    }
    public int height(ListNode head){
        if(head==null ){
            return 0;
        }
        int count=0;
        while (head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}