package round2;

public class P344 {

    public String reverseString(String s) {
        char[] res = new char[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            res[i] = s.charAt(s.length() - i - 1);
        }
        return new String(res);
    }
}
