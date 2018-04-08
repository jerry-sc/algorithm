package pinduoduo;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int hour, min;
        String[] parts = line.split(":");
        hour = Integer.parseInt(parts[0]);
        min = Integer.parseInt(parts[1]);
        hour %= 12;
        double part1 = min / 2.0;
        int part2 = (hour * 5 + 60 - min) % 60 * 6;
        double res = (part1 + part2) > 180 ? (360 - part2 - part1 > 0 ? 360 - part2 - part1 : part1 + part2 - 360) : part1 + part2;
        if (min % 2 == 0)
            System.out.println((int) res);
        else {
            System.out.println(String.format("%.1f", res));
        }
    }
}
