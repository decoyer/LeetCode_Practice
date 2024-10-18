class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = new ListNode(0);
        ListNode start = tmp;
        ListNode end = tmp;
        tmp.next = head;
        
        for (int i = 0; i <= n; i++)
            end = end.next;
        
        while (end != null) {
            start = start.next;
            end = end.next;
        }
        
        start.next = start.next.next;
        
        return tmp.next;
    }
}