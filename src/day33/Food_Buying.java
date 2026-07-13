package day33;

import java.util.Scanner;

public class Food_Buying {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            long ans = 0;
            long s = sc.nextLong();
            while (s >= 10) {
                long rem = s % 10;
                ans += s - rem;
                s = rem + s / 10;
            }
            ans += s;
            System.out.println(ans);
        }
    }
}
