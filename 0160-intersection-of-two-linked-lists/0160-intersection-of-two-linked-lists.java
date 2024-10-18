public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        // 2개의 노드를 1칸씩 이동시키면서 같은 노드인지 확인
        while (a != b) {
            // 노드 끝까지 가면 다른 노드에서 다시 출발
            if (a == null)
                a = headB;
            else
                a = a.next;
            // 노드 끝까지 가면 다른 노드에서 다시 출발
            if (b == null)
                b = headA;
            else
                b = b.next;
        }

        return a;
    }
}
