package leetcode;

public class P168 {

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        if (--n == 0)
            return "A";
        while (n>0) {
            int tmp = n % 26;
            sb.append((char) (tmp + 65));
            n /= 26;
            if (n == 1)
                sb.append("A");
            --n;
        }

        return sb.reverse().toString();
    }
}
