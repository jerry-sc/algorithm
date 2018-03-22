package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created on 2018-03-22
 *
 * @author Jerry Shen
 */
public class P45 {

    public String PrintMinNumber(int [] numbers) {
        ArrayList<String> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(num + "");
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String c1 = o1 + o2;
                String c2 = o2 + o1;
                return c1.compareTo(c2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(String str : list) {
            sb.append(str);
        }
        return sb.toString();
    }

}
