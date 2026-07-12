package day32;

import java.util.Scanner;

public class Fair_Playoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int p1=sc.nextInt();
            int p2=sc.nextInt();
            int p3=sc.nextInt();
            int p4=sc.nextInt();
            if(Math.max(p1,p2)<Math.min(p3,p4) || Math.max(p3,p4)<Math.min(p1,p2) ){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
