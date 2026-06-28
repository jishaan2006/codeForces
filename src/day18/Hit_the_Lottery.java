package day18;

import java.util.Scanner;

public class Hit_the_Lottery {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] bills = {100, 20, 10, 5, 1};
        int c=0;
        for(int bill:bills){
            c+=n/bill;
            n%=bill;
        }
        System.out.println(c);
    }
}
