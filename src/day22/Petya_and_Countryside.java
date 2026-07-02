package day22;

import java.util.Scanner;

public class Petya_and_Countryside {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=0;

        for(int i=0;i<n;i++){
            int count =1;
            int left=i;
            while(left>0 && arr[left-1]<=arr[left]){
                left--;
                count++;
            }
            int right=i;
            while(right<n-1 && arr[right+1]<=arr[right]){
                right++;
                count++;
            }
            max=Math.max(count,max);
        }
        System.out.println(max);
    }
}
