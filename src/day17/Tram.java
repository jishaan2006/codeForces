package day17;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int max_in=0;
        int total_in=0;
        for(int i=0;i<n;i++){
            int out=s.nextInt();
            int in=s.nextInt();
            total_in-=out;
            total_in+=in;
            if(total_in>max_in){
                max_in=total_in;
            }
        }
        System.out.println(max_in);
    }
}
