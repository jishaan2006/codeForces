package day18;

import java.util.HashSet;
import java.util.Scanner;

public class I_Wanna_Be_the_Guy {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        int levels=s.nextInt();
        int x=s.nextInt();
        for (int i = 0; i < x; i++) {
            set.add(s.nextInt());
        }
        int y=s.nextInt();
        for (int i = 0; i < y; i++) {
            set.add(s.nextInt());
        }
        if(set.size()<levels){
            System.out.println("Oh, my keyboard!");
        }else{
            System.out.println("I become the guy.");
        }

    }
}
