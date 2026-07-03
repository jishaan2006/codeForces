package day23;

import java.util.Arrays;
import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String[] arr=s.split("WUB");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=""){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
