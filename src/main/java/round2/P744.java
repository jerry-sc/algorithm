package round2;

/**
 * Created on 2018-01-28
 *
 * @author Jerry Shen
 */
public class P744 {

    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (letters[mid] > target)  right = mid;
            else left = mid + 1;
        }
        if (left == letters.length) return letters[0];
        else return letters[left];
    }
}
