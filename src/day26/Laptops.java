package day26;

import java.util.Arrays;
import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] laptop=new int[n][2];
        for (int i = 0; i < n; i++) {
            laptop[i][0]=sc.nextInt();
            laptop[i][1]=sc.nextInt();
        }
        Arrays.sort(laptop,(a,b)->Integer.compare(a[0],b[0]));
        for (int i = 1; i < n; i++) {
            if(laptop[i-1][1]>laptop[i][1]){
                System.out.println("Happy Alex\n");
                return;
            }
        }
        System.out.println("Poor Alex\n");
    }
}
