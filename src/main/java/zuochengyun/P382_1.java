package zuochengyun;

public class P382_1 {

    public void leftUnique(int[] arr) {
        if (arr.length == 0) return;
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[j] > arr[i]) {
                ++i;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j++] = tmp;
            }
            else ++j;
        }
    }
}
