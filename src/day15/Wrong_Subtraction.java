package day15;

import java.util.Scanner;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k= s.nextInt();
        while(k-->0){
            if(n%10!=0){
                n--;
            }else{
                n=n/10;
            }
        }
        System.out.println(n);
    }
}
