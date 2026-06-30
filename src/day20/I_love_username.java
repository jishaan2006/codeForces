package day20;

import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int max=a;
        int min=a;
        int c=0;
        for (int i = 1; i < n; i++) {
            int ai=sc.nextInt();
            if(ai>max){
                max=ai;
                c++;
            }
            if(ai<min){
                min=ai;
                c++;
            }
        }
        System.out.println(c);
    }
}
