package day2;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] mag=new String[n];
        for(int i=0;i<n;i++){
            mag[i]=sc.next();
        }
        int group=1;
        for(int i=1;i<n;i++){
            if(!mag[i].equals(mag[i-1])){
                group++;
            }
        }
        System.out.println(group);
    }
}
