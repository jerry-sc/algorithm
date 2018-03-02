package round2;

/**
 * Created on 2018-03-02
 *
 * @author Jerry Shen
 */
public class P443 {

    public int compress(char[] chars) {
        int i = 1;
        int tmp = 1;
        int count = 1;
        while (i < chars.length) {
            if (chars[i] == chars[i-1]) {
                ++count;
            } else {
                if (count > 1) {
                   if (count < 10) {
                       chars[tmp++] = (char) (count + '0');
                   } else if (count >= 100) {
                       chars[tmp++] = (char) (count / 100 + '0');
                       chars[tmp++] = (char) ((count % 100) / 10 + '0');
                       chars[tmp++] = (char) (count % 10 + '0');
                   } else {
                       chars[tmp++] = (char) (count / 10 + '0');
                       chars[tmp++] = (char) (count % 10 + '0');
                   }
                }

                count=1;
                chars[tmp++] = chars[i];
            }
            ++i;
        }
        if (count > 1) {
            if (count < 10) {
                chars[tmp++] = (char) (count + '0');
            } else if (count >= 100) {
                chars[tmp++] = (char) (count / 100 + '0');
                chars[tmp++] = (char) ((count % 100) / 10 + '0');
                chars[tmp++] = (char) (count % 10 + '0');
            } else {
                chars[tmp++] = (char) (count / 10 + '0');
                chars[tmp++] = (char) (count % 10 + '0');
            }
        }
        return tmp;
    }
}
