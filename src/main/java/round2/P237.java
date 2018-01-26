package round2;

/**
 * Created on 2018-01-26
 *
 * @author Jerry Shen
 */
public class P237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
