package day22;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=k-1;i<n;i++){
            int diff=arr[i]-arr[i-k+1];
            min=Math.min(min,diff);
        }
        System.out.println(min);
    }
}
