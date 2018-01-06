package round1;

public class P234 {

    public boolean isPalindrome(ListNode head) {
        ListNode slower = head;
        ListNode faster = head;
        while (faster != null && faster.next != null) {
            slower = slower.next;
            faster = faster.next.next;
        }
        if (faster != null) { // odd num
            slower = slower.next;
        }
        faster = head;
        slower = reverse(slower);
        while (slower != null) {
            if (slower.val != faster.val)
                return false;
            faster = faster.next;
            slower = slower.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev =  null;
        while (head != null) {
            ListNode q = head.next;
            head.next = prev;
            prev = head;
            head = q;
        }
        return prev;
    }
}
