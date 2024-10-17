public class Solution {
    public boolean hasCycle(ListNode head) {
        // 입력 노드를 서로 다른 2개의 노드로 저장
        ListNode fast = head;
        ListNode slow = head;

        // 1칸씩 이동하는 노드가 2칸씩 이동하는 노드와 만나는지 확인(싸이클이 존재)
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow)
                return true;
        }

        return false;
    }
}
