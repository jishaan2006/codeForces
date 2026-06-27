package day17;

import java.util.Scanner;

public class Arrival_of_the_General {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] heights=new int[n];
         for(int i=0;i<n;i++){
             heights[i]=sc.nextInt();
         }
         int min = heights[0];
         int max = heights[0];
         int min_index=0;
         int max_index=0;
         for(int i=0;i<n;i++){
             if(heights[i]>max){
                 max=heights[i];
                 max_index=i;
             }
             if(heights[i]<=min){
                 min=heights[i];
                 min_index=i;
             }
         }
         int ans=max_index+(n-1-min_index);
         if(max_index>min_index){
             ans--;
         }
         System.out.println(ans);
     }
}
