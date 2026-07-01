package day21;

import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long oddCount = (n + 1) / 2;
        long answer;
        if (k <= oddCount) {
            answer = 2 * k - 1;
        } else {
            long m = k - oddCount;
            answer = 2 * m;
        }
        System.out.println(answer);
    }
}
