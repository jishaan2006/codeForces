package day28;

import java.util.Scanner;

public class How_Much_Does_Daytona_Cost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int target= sc.nextInt();
            boolean found=false;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a==target){
                    found=true;
                }
            }
            System.out.println((found)? "YES":"NO");
        }
    }
}
