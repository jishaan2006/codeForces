package day15;

import java.util.Scanner;

public class Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int luckyCount = 0;
        while (n > 0) {
            long ld = n % 10;
            if (ld == 4 || ld == 7) {
                luckyCount++;
            }
            n = n / 10;
        }
        if(luckyCount==4 || luckyCount ==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
