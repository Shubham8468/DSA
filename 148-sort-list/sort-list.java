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
    public ListNode gitmid(ListNode temp){
        ListNode slow=temp;
        ListNode fast=temp.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode mergerll(ListNode leftLL,ListNode rightLL){
        ListNode ans=new ListNode(0);
        ListNode temp=ans;
        while(leftLL!=null && rightLL!=null){
            if(leftLL.val<rightLL.val){
                temp.next=leftLL;
                temp=leftLL;
                leftLL=leftLL.next;
            }
            else{
                temp.next=rightLL;
                temp=rightLL;
                rightLL=rightLL.next;
            }
        }
        while(leftLL!=null){
            temp.next=leftLL;
            temp=leftLL;
            leftLL=leftLL.next;
        }
        while(rightLL!=null){
            temp.next=rightLL;
            temp=rightLL;
            rightLL=rightLL.next;
        }
        return ans.next;
    }
    public ListNode meargSort(ListNode temp){
        if(temp==null || temp.next==null){
            return temp;
        }
      ListNode mid=gitmid(temp);
      ListNode right=mid.next;
      mid.next=null;
      ListNode left=temp;
      ListNode leftLL=meargSort(left);
      ListNode rightLL=meargSort(right);
        return mergerll(leftLL,rightLL);

    }
    public ListNode sortList(ListNode head) {
       return  meargSort(head);

    }
}