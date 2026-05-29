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
    public int lef(ListNode temp) {
    if (temp == null) {
        return 0;
    }
    int count = 0;
    while (temp != null) {
        count += 1;
        temp = temp.next;
    }
    return count;
}

public ListNode reverseKGroup(ListNode head, int k) {
    Stack<Integer> st = new Stack<>();
    ListNode temp = head;
    ListNode ans = new ListNode(0);
    ListNode an = ans;
    int count = lef(head);

    while (temp != null) {
        if (count >= k) {
            for (int i = 1; i <= k; i++) {
                st.push(temp.val);
                count -= 1;
                temp = temp.next;
            }
            while (!st.isEmpty()) {
                ListNode tem = new ListNode(st.pop());
                an.next = tem;
                an = tem;
            }
        } else {
            break;
        }
        // ❌ REMOVED: if(temp!=null){ temp=temp.next; }
        // ❌ REMOVED: if(temp!=null){ an.next=temp; }
    }

    an.next = temp; // ✅ attach remaining nodes ONCE after loop
    return ans.next;
}
}