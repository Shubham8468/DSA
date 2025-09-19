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
    public ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode ans=new ListNode(0);
        ListNode temp=ans;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        while(list1!=null){
            temp.next=list1;
            temp=temp.next;
            list1=list1.next;
        }
        while(list2!=null){
            temp.next=list2;
            temp=temp.next;
            list2=list2.next;
        }
        return ans.next;

    }
    public ListNode mergeKLists(ListNode[] list) {
        if(list==null || list.length==0){
            return null;
        }
        ListNode result=list[0];
        for(int i=1;i<list.length;i++){
            result=mergeTwoLists(result,list[i]);
        }
        return result;
    }
}