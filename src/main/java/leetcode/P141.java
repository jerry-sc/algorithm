package leetcode;

public class P141 {

    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode slower = head;
        ListNode faster =  head;
        while (faster.next != null && faster.next.next!=null) {
            slower = slower.next;
            faster = faster.next.next;
            if (slower == faster)
                return true;
        }
        return false;
    }
}
