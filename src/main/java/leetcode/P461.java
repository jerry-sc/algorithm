package leetcode;


/**
 * 求海明距
 *
 * @author Jerry Shen
 */
public class P461 {

    public static void main(String[] args) {
        int[] digits = {5,2,8};
        int sum = 0;
        for(int i = 0; i < digits.length; ++i) {
            sum = sum * 10 + digits[i];
        }
        ++sum;
        String str = sum + "";
        int[] a = new int[str.length()];
        for(int i = 0;i < a.length;++i) {
            a[i] = str.charAt(i) - '0';
        }
        for (int i = 0;i<a.length;++i) {
            System.out.println(a[i]);
        }
    }
}
