package day26;

import java.util.Scanner;

public class TL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int min_correct=Integer.MAX_VALUE;
        int max_correct=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a > max_correct) {
                max_correct = a;
            }
            if(a<min_correct){
                min_correct=a;
            }

        }
        int max=Math.max(max_correct,2*min_correct);
        int min_wrong=Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            int a= sc.nextInt();
            if(min_wrong>a){
                min_wrong=a;
            }
        }
        if(max<min_wrong){
            System.out.println(max);
        }else{
            System.out.println(-1);
        }
    }
}
