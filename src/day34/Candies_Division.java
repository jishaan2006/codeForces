package day34;

import java.util.Scanner;

public class Candies_Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long ans=0;
        while (t-->0){
            long candies=sc.nextInt();
            long k= sc.nextInt();

            long q = candies / k;
            long r=candies%k;
            if (candies % k == 0) {
                ans = candies;
            }else{
                ans = Math.min(candies, q * k + k / 2);
            }
            System.out.println(ans);
        }

    }
}
