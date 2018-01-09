package round2;

/**
 * Created on 2018-01-08
 *
 * @author Jerry Shen
 */
public class P557 {

    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuilder builder = new StringBuilder();
        builder.append(new StringBuilder(ss[0]).reverse());
        for (int i = 1; i < ss.length; ++i) {
            builder.append(" ").append(new StringBuilder(ss[i]).reverse());
        }
        return builder.toString();
    }
}
