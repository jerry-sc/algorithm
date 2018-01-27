package round2;

public class P206 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            if (next != null) head = next;
            else break;
        }
        return head;
    }
}
