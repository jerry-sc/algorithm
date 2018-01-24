package round2;

public class P492 {

    public int[] constructRectangle(int area) {
        int L = (int) Math.sqrt(area);
        int R = L;
        while (L * R != area) {
            ++L;
            R = area / L;
        }
        int[] res = new int[2];
        res[0] = L;
        res[1] = R;
        return res;
    }
}
