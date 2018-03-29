package netease;

import java.util.*;

/**
 * Created on 2018-03-29
 *
 * @author Jerry Shen
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Job> jobs = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) {
            jobs.add(new Job(scanner.nextInt(), scanner.nextInt()));
        }
        int mem[] = new int[m];
        for (int i = 0; i < m; ++i) {
            mem[i] = scanner.nextInt();
        }
        Collections.sort(jobs, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o1.diff - o2.diff;
            }
        });
        for (int a : mem) {
            int ind = binarySearch(jobs, 0, jobs.size(), a);
            int max = -1;
            for (int i = 0; i < ind; ++i) {
                max = Math.max(max, jobs.get(i).p);
            }
            System.out.println(max);
        }
    }

    static int binarySearch(List<Job> jobs, int low, int high, int key) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (jobs.get(mid).diff <= key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    static class Job {
        int diff;
        int p;
        public Job(int diff, int p) {
            this.diff = diff;
            this.p = p;
        }
    }
}
