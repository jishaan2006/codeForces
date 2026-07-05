package day25;

import java.util.Scanner;

public class Cifera {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int div=0;
        long k=sc.nextLong();
        long l=sc.nextLong();
        if(k==1){
            if(l==1){
                System.out.println("YES");
                System.out.println(div);
                return;
            }else {
                System.out.println("NO");
                return;
            }
        }
        while(l%k==0){
            l=l/k;
            div++;
        }
        if(l==1){
            System.out.println("YES");
            System.out.println(div-1);
        }else{
            System.out.println("NO");
        }
    }
}
