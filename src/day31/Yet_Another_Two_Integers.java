package day31;

import java.util.Scanner;

public class Yet_Another_Two_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int diff = Math.abs(a - b);
            int moves = (diff + 9) / 10;
            System.out.println(moves);
        }
    }
}