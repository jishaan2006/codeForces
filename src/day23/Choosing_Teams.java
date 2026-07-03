package day23;

import java.util.Scanner;

public class Choosing_Teams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int c=0;
        while(n-->0){
            int a=5-sc.nextInt();
            if(a>=k){
                c++;
            }
        }
        System.out.println(c/3);
    }
}
