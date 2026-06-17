package day9;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++) {
            ans[arr[i] - 1] = i + 1;
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
