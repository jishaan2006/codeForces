package day12;

import java.util.Scanner;

public class Oath_of_the_Nights_Watch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] stewards=new int[n];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            stewards[i]=sc.nextInt();
            if(stewards[i]>max){
                max=stewards[i];
            }
            if(stewards[i]<min){
                min=stewards[i];
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(stewards[i]<max && stewards[i]>min){
                c++;
            }
        }
        System.out.println(c);
    }
}
