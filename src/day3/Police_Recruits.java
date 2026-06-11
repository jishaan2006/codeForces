package day3;

import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] events=new int[n];
        for(int i=0;i<n;i++){
            events[i]= sc.nextInt();
        }
        int count =0;
        int police=0;
        for(int i=0;i<n;i++){
            if(events[i] == -1){
                if(police > 0){
                    police--;
                } else {
                    count++;
                }
            } else {
                police += events[i];
            }
        }
        System.out.println(count);
    }
}
