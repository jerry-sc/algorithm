package round2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P501 {

    private Map<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {
        preOrder(root);
        int max = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) max = entry.getValue();
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) list.add(entry.getKey());
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) res[i] = list.get(i);
        return res;
    }

    private void preOrder(TreeNode root) {
        if (root == null)   return;
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        preOrder(root.left);
        preOrder(root.right);
    }
}
