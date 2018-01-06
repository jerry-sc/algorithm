package round2;

public class P657 {

    public boolean judgeCircle(String moves) {
        int U = 0, D = 0, L = 0, R = 0;
        for (char ch : moves.toCharArray()) {
            switch (ch) {
                case 'U':
                    ++U;break;
                case 'D':
                    ++D;break;
                case 'L':
                    ++L;break;
                case 'R':
                    ++R;break;
            }
        }
        return U == D && L == R;
    }
}
