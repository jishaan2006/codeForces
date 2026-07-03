package day23;

import java.util.Scanner;

public class Even_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int wrong_even=0;
            int wrong_odd=0;
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                if (i % 2 == 0 && a % 2 != 0) {
                    wrong_even++;
                } else if (i % 2 != 0 && a % 2 == 0) {
                    wrong_odd++;
                }
            }
            if(wrong_even!=wrong_odd){
                System.out.println(-1);
            }else{
                System.out.println(wrong_even);
            }
        }
    }
}
