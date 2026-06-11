package day3;

import java.util.Scanner;

public class Sereja_and_Dima {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] cards=new int[n];
        for(int i=0;i<n;i++){
            cards[i]=sc.nextInt();
        }
        boolean sereja_turn=true;
        int sereja_sum=0,dima_sum=0;
        int l=0,r=n-1;
        while(l<=r){
            int chosen=0;
            if (cards[l]>cards[r]){
                chosen=cards[l];
                l++;
            }else{
                chosen=cards[r];
                r--;
            }
            if(sereja_turn){
                sereja_sum+=chosen;
            }else{
                dima_sum+=chosen;
            }
            sereja_turn=!sereja_turn;
        }
        System.out.println(sereja_sum+" "+dima_sum);
    }
}
