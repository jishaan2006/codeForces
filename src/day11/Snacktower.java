package day11;

import java.util.Scanner;

public class Snacktower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] snacks=new int[n];
        for(int i=0;i<n;i++){
            snacks[i]=sc.nextInt();
        }
        boolean[] arrived=new boolean[n+1];
        int need=n;
        for(int i=0;i<n;i++){
            arrived[snacks[i]]=true;
            while(need>=1 && arrived[need]){
                System.out.print(need+" ");
                need--;
            }
            System.out.println();
        }
    }
}
