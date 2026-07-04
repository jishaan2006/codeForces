package day24;

import java.util.Scanner;

public class Jeff_and_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count_five=0;
        int count_zero=0;
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            if (a == 5) {
                count_five++;
            }else {
                count_zero++;
            }
        }
        if(count_zero<1){
            System.out.println(-1);
        }
        else if(count_five<9) {
            System.out.println(0);
        }else{
            for (int i = 0; i <count_five-count_five%9; i++) {
                System.out.print(5);
            }
            for (int i = 0; i < count_zero; i++) {
                System.out.print(0);
            }
        }
    }
}
