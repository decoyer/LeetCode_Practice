class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // 노드 값이 있을 때만 반환
        if (head == null)
            return null;

        // 재귀형 함수로 작성
        head.next = removeElements(head.next, val);

        // 노드 값이 val 값과 같으면 스킵하여 반환
        if (head.val == val)
            return head.next;
        else
            return head;
    }
}
