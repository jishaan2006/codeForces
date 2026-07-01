package day21;

import java.util.Scanner;
import java.util.SortedMap;

public class Divide_and_Conquer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if (x == y)
                System.out.println("YES");
            else if (y == 1)
                System.out.println("NO");
            else if (x % y == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}
