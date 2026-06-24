package day15;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        if(w%5==0){
            System.out.println(w/5);
        }else{
            System.out.println((w/5)+1);
        }
    }
}
