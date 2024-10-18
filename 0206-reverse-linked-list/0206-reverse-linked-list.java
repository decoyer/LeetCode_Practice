class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        
        while (head != null) {
            ListNode tmp = head;
            
            head = head.next;
            tmp.next = result;
            result = tmp;
        }
        
        return result;
    }
}