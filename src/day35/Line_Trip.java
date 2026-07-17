package day35;

import java.util.Scanner;

public class Line_Trip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int prev = 0;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int cur = sc.nextInt();
                ans = Math.max(ans, cur - prev);
                prev = cur;
            }
            ans = Math.max(ans, 2 * (x - prev));
            System.out.println(ans);
        }
    }
}
