package day17;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        int total=0;
        for(int i=0;i<n;i++){
            double p= sc.nextDouble();
            total+=p;
        }
        System.out.println(total/n);
    }
}
