package round2;

/**
 * Created on 2018-01-22
 *
 * @author Jerry Shen
 */
public class P717 {

    public boolean isOneBitCharacter(int[] bits) {
        for (int i = 0; i < bits.length;) {
            if (i == bits.length - 1)
                return true;
            if (bits[i] == 1) {
                i += 2;
            } else {
                ++i;
            }
        }
        return false;
    }
}
