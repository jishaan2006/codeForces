package day19;

import java.util.Scanner;

import java.util.*;

public class Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> ans = new ArrayList<>();
            int place = 1;
            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    ans.add(digit * place);
                }
                place=place*10;
                n=n/ 10;
            }
            System.out.println(ans.size());
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
