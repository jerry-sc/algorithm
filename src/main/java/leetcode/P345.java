package leetcode;

/**
 * Created on 2017-11-28
 *
 * @author Jerry Shen
 */
public class P345 {

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0,j=s.length()-1;
        while (i<j){
            while (!isVowel(arr[i]) && i<j) {
                ++i;
            }
            while (!isVowel(arr[j]) && i<j) {
                --j;
            }
            if (i < j) {
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                ++i;--j;
            }
        }
        return new String(arr);
    }

    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U';
    }
}
