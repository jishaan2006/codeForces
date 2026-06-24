package day15;

import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int n= s.nextInt();
        int w=s.nextInt();
        int cost= ((w*(w+1))/2)*k;
        if(cost<=n){
            System.out.println(0);
        }else{
            System.out.println(cost-n);
        }
    }
}
