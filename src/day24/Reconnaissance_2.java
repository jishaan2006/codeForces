package day24;

import java.util.Scanner;

public class Reconnaissance_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minDiff = Integer.MAX_VALUE;
        int ans1=0,ans2=0;
        for (int i = 1; i < n; i++) {
            if(Math.abs(arr[i-1]-arr[i])<minDiff){
                minDiff=Math.abs(arr[i-1]-arr[i]);
                ans1 = i;
                ans2 = i + 1;
            }
        }
        if(Math.abs(arr[0]-arr[n-1])<minDiff){
            ans1=1;
            ans2 =n;
        }
        System.out.println(ans1+" "+ans2);
    }
}
