class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null)
            slow = slow.next;

        ListNode check = reverseList(slow);

        while (check != null) {
            if (head.val != check.val)
                return false;
            head = head.next;
            check = check.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head) {
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