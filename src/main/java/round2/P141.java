package round2;

/**
 * Created on 2018-03-02
 *
 * @author Jerry Shen
 */
public class P141 {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            if (fast == slow)   return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
