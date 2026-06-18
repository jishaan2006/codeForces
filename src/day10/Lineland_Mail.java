package day10;

import java.util.Scanner;

public class Lineland_Mail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] x = new long[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            long min, max;

            if (i == 0) {
                min = x[1] - x[0];
            } else if (i == n - 1) {
                min = x[n - 1] - x[n - 2];
            } else {
                long left = x[i] - x[i - 1];
                long right = x[i + 1] - x[i];
                min = Math.min(left, right);
            }

            long d1 = x[i] - x[0];
            long d2 = x[n - 1] - x[i];
            max = Math.max(d1, d2);

            System.out.println(min + " " + max);
        }

        sc.close();
    }
}