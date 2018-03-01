package round2;

public class P434 {
    public int countSegments(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        int count = 0;
        int i = 0;
        boolean flag = true;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) != ' ') {
                if (flag){
                    flag = false;
                    ++count;
                }
                ++i;
            }
            while (i < s.length() && s.charAt(i) == ' ') {
                ++i;
                flag = true;
            }
        }
        return count;
    }
}
