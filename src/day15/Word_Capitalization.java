package day15;

import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder a=new StringBuilder(s);
        a.setCharAt(0, Character.toUpperCase(a.charAt(0)));
        System.out.println(a);

    }
}
