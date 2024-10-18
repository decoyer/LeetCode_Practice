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
    public ListNode removeElements(ListNode head, int val) {
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        ListNode cur = tmp;

        while(cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        return tmp.next;
    }
}