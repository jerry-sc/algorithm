package round2;

public class P83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev, first;
        if (head == null)   return null;
        prev = head;
        first = head;
        while (head != null) {
            if (head.val != prev.val) {
                prev.next = head;
                prev = head;
            }
            head = head.next;
            prev.next = null;
        }
        return first;
    }
}
