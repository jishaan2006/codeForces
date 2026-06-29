package day19;

import java.util.Scanner;

public class YES_or_YES {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String s= sc.next();
            if(s.toLowerCase().equals("yes")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
