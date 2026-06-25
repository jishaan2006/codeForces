package day16;

import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int y=s.nextInt();
        while(true){
            y++;
            int a = y / 1000;
            int b = (y / 100) % 10;
            int c = (y / 10) % 10;
            int d = y % 10;

            if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
                System.out.println(y);
                break;
            }
        }
    }
}
