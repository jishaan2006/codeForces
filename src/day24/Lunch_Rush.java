package day24;

import java.util.Scanner;

public class Lunch_Rush {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int max_joy=Integer.MIN_VALUE;
        while(n-->0){
            int f= sc.nextInt();
            int t= sc.nextInt();
            if(t>k){
                max_joy=Math.max(max_joy,f-(t-k));
            }else{
                max_joy=Math.max(max_joy,f);
            }
        }
        System.out.println(max_joy);
    }
}
