package leetcode;

public class P160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != null && p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        ListNode q = headA, r = headB;
        if (p1 != null) {
            q = headA;
            r = headB;
        }
        while (p1 != null) {
            q = q.next;
            p1 = p1.next;
        }
        if (p2 != null) {
            q = headB;
            r = headA;
        }
        while (p2 != null) {
            q = q.next;
            p2 = p2.next;
        }
        ListNode res = q;
        while (q != null) {
            if (q.val != r.val) {
                res = q.next;
            }
            q = q.next;
            r = r.next;
        }
        return res;
    }
}
