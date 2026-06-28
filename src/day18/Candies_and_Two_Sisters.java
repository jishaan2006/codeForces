package day18;

import java.util.Scanner;

public class Candies_and_Two_Sisters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0){
            int c=sc.nextInt();
            System.out.println((c-1)/2);
        }
    }
}
