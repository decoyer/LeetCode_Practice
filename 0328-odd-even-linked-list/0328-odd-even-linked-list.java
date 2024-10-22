class Solution {
    public ListNode oddEvenList(ListNode head) {
        // 예외 처리
        if (head == null) {
            return head;
        }

        // 홀수 번째 노드, 짝수 번째 노드, 더미 노드 생성
        ListNode odd = head;
        ListNode even = head.next;
        ListNode tmp = even;

        // 홀수 노드, 짝수 노드 순회
        while (odd.next != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        
        // 홀수 노드 끝에 짝수 노드 연결
        odd.next = tmp;
        
        return head;
    }
}
