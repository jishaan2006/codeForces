package day7;

import java.util.Scanner;

public class Juicer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();

        int cap = 0;
        int bin = 0;

        for (int i = 0; i < n; i++) {
            int orange = sc.nextInt();

            if (orange <= b) {
                cap += orange;

                if (cap > d) {
                    bin++;
                    cap = 0;
                }
            }
        }

        System.out.println(bin);
    }
}