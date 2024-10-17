public class Solution {
    public ListNode detectCycle(ListNode head) {
        // 입력 노드를 서로 다른 2개의 노드로 저장
        ListNode fast = head;
        ListNode slow = head;

        // 1칸씩 이동하는 노드가 2칸씩 이동하는 노드와 만나는지 확인(싸이클이 존재)
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            // 싸이클이 존재하면 1칸씩 이동하며 2개의 노드가 만나는 지점 찾기
            if (fast == slow) {
                slow = head;
                
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                
                return slow;
            }
        }

        return null;
    }
}
