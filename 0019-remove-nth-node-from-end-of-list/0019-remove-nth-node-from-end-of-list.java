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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = new ListNode(0);
        ListNode start = tmp;
        ListNode end = tmp;
        tmp.next = head;
        
        for(int i = 1; i <= n+1; i++){
            end = end.next;
        }
        
        while(end != null) {
            start = start.next;
            end = end.next;
        }
        
        start.next = start.next.next;
        
        return tmp.next;
    }
}