package round2;

/**
 * Created on 2018-02-04
 *
 * @author Jerry Shen
 */
public class P21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode node, head;
        if (l1.val < l2.val) {
            node = l1;
            l1 = l1.next;
        } else {
            node = l2;
            l2 = l2.next;
        }
        head = node;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        while (l1 != null) {
            node.next = l1;
            l1 = l1.next;
            node = node.next;
        }
        while (l2 != null) {
            node.next = l2;
            l2 = l2.next;
            node = node.next;
        }
        return head;
    }
}
