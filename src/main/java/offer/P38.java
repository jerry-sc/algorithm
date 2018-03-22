package offer;

/**
 * Created on 2018-03-22
 *
 * @author Jerry Shen
 */
public class P38 {

    public void permutation(String str) {
        if (str.length() == 0) return;
        helper(str.toCharArray(), 0);
    }

    private void helper(char[] ch, int i) {
        if (i == ch.length -1) System.out.println(ch);
        else {
            for (int j = i; j < ch.length; ++j) {
                swap(ch, i, j);
                helper(ch, i + 1);
                swap(ch, i, j);
            }
        }
    }

    private void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
}
