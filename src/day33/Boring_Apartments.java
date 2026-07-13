package day33;

import java.util.Scanner;

public class Boring_Apartments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x= sc.nextInt();
            String s = String.valueOf(x);
            int len = s.length();
            int d = s.charAt(0) - '0';

            int ans = (d - 1) * 10 + (len * (len + 1)) / 2;
            System.out.println(ans);
        }
    }
}
