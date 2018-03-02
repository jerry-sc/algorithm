package round2;

public class P234 {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newNode = null;
        while (slow != null) {
            ListNode q = slow.next;
            slow.next = newNode;
            newNode = slow;
            slow = q;
        }
        fast = head;
        while (newNode != null) {
            if (newNode.val != fast.val) return false;
            newNode = newNode.next;
            fast = fast.next;
        }
        return true;
    }
}
