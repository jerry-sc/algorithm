package round1;

import java.util.ArrayList;
import java.util.List;

public class P206 {

    public ListNode reverseList(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }
        if (nodes.size() == 0)
            return null;
        nodes.get(0).next = null;
        for (int i=1;i<nodes.size();++i){
            nodes.get(i).next = nodes.get(i-1);
        }
        return nodes.get(nodes.size()-1);
    }
}
