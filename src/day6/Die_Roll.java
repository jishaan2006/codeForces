package day6;

import java.util.Scanner;

public class Die_Roll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int w=sc.nextInt();

        int d=7-Math.max(y,w);
        int div=gcd(d,6);
        System.out.println(d/div+"/"+6/div);

    }
    static int gcd(int n,int d){
        if(d==0){
            return n;
        }
        return gcd(d,n%d);
    }
}
