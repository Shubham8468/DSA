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
     public ListNode midI(ListNode head){
            if(head==null || head.next==null){
                return head;
            }
            ListNode slow=head,fast=head.next;
            while (fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }
    public ListNode mergeList(ListNode l1, ListNode l2){
            if(l1==null && l2==null){
                return l1;
            }
            ListNode ans= new ListNode(0);
            ListNode an=ans,t1=l1,t2=l2;
            while (t1!=null && t2!=null){
                if(t1.val<t2.val){
                    an.next=t1;
                    an=t1;
                    t1=t1.next;
                }else{
                    an.next=t2;
                    an=t2;
                    t2=t2.next;
                }
            }
            if(t1!=null){
                while (t1!=null){
                    an.next=t1;
                    an=t1;
                    t1=t1.next;
                }
            }
            if(t2!=null){
                while (t2!=null){
                    an.next=t2;
                    an=t2;
                    t2=t2.next;
                }
            }
            return ans.next;
        }
        public ListNode sortL(ListNode head){
            if(head==null || head.next==null){
                return head;
            }
            ListNode midItem=midI(head);
            ListNode right=midItem.next;
            midItem.next=null;
            ListNode left=head;
            // after this do magic

            ListNode l1=sortL(left);
            ListNode l2=sortL(right);
            return mergeList(l1,l2);
        }
     public ListNode sortList(ListNode head) {
       if(head==null || head.next==null){
           return head;
       }
       return sortL(head);
     }
}