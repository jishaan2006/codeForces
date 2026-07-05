package day25;

import java.util.Scanner;

public class Young_Physicist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum_x=0;
        int sum_y=0;
        int sum_z=0;
        while(n-->0){
            int x= sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            sum_x+=x;
            sum_y+=y;
            sum_z+=z;
        }
        if(sum_x==0 && sum_y==0 && sum_z==00){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
