class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 더미 노드 생성 및 2개의 포인터 연결
        ListNode tmp = new ListNode(0);
        ListNode start = tmp;
        ListNode end = tmp;
        tmp.next = head;

        // 삭제하려는 노드 1칸 뒤에 포인터1 위치
        for (int i = 0; i <= n; i++)
            end = end.next;

        // 삭제하려는 노드 1칸 뒤에 포인터2 위치(포인터1 노드 끝까지 이동)
        while (end != null) {
            start = start.next;
            end = end.next;
        }

        // 삭제하려는 노드 스킵
        start.next = start.next.next;

        
        return tmp.next;
    }
}
