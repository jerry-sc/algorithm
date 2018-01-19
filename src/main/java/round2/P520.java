package round2;

public class P520 {

    public boolean detectCapitalUse(String word) {
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            String tmp = word.substring(1);
            return tmp.equals(tmp.toUpperCase()) || tmp.equals(tmp.toLowerCase());
        } else {
            return word.equals(word.toLowerCase());
        }
    }
}
