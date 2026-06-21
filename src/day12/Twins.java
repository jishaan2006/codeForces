package day12;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] coin=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            coin[i]=sc.nextInt();
            sum+=coin[i];
        }
        Arrays.sort(coin);
        int c=0;
        int take=0;
        for(int i=n-1;i>=0;i--){
            take+=coin[i];
            sum-=coin[i];
            c++;
            if(sum<take){
                System.out.println(c);
                return;
            }
        }
    }
}
