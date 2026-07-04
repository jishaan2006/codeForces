package day24;

import java.util.Scanner;

public class Effective_Approach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] pos = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pos[nums[i]] = i + 1;
        }

        int m = sc.nextInt();

        long compare_lr = 0;
        long compare_rl = 0;

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            compare_lr += pos[x];
            compare_rl += n - pos[x] + 1;
        }

        System.out.println(compare_lr + " " + compare_rl);
    }
}