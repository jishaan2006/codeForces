package day21;

import java.util.Scanner;

public class A_plus_B_Again {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int sum=0;
            int n=sc.nextInt();
            sum+=n%10;
            sum+=n/10;
            System.out.println(sum);
        }
    }
}
