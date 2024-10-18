class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode result = null;

        // 더미 노드 생성 및 노드 값 저장
        while (head != null) {
            ListNode tmp = head;
            
            head = head.next;
            tmp.next = result;
            result = tmp;
        }
        
        return result;
    }
}
