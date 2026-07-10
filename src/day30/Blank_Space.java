package day30;

import java.util.Scanner;

public class Blank_Space {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int c=0;
            int max=Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                if(a==0){
                    c++;
                }else{
                    c=0;
                }
                max=Math.max(max,c);
            }
            System.out.println(max);
        }
    }
}
