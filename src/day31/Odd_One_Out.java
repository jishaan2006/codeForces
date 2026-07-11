package day31;

import java.util.Scanner;

public class Odd_One_Out {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int diff=0;
            if(a==b){
                diff=c;
            } else if (a==c) {
                diff=b;
            }else {
                diff = a;
            }
            System.out.println(diff);
        }
    }
}
