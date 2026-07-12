package day32;

import java.util.Scanner;

public class Mishka_and_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int w1=0;
        int w2=0;
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                w1++;
            }else if(b>a){
                w2++;
            }
        }
        if(w1>w2){
            System.out.println("Mishka");
        } else if (w1 < w2) {
            System.out.println("Chris");
        }else{
            System.out.println("Friendship is magic!^^");
        }
    }
}
