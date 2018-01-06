package round1;

public class P83 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while (p!=null){
            ListNode q = p.next;
            while (q != null && q.val == p.val) {
                q = q.next;
            }
            p.next = q;
            p = q;
        }
        return head;
    }
}
