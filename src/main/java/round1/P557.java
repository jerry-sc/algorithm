package round1;

/**
 * Created on 2017-11-23
 *
 * @author Jerry Shen
 */
public class P557 {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(new StringBuffer(word).reverse()).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
