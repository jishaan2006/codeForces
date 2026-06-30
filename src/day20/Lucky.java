package day20;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int first_3 = n / 1000;
            int last_3 = n % 1000;
            int sum_first3=0;
            int sum_last3=0;
            while (first_3 > 0) {
                sum_first3 += first_3 % 10;
                first_3 /= 10;
            }

            while (last_3 > 0) {
                sum_last3 += last_3 % 10;
                last_3 /= 10;
            }
            if(sum_last3!=sum_first3){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
