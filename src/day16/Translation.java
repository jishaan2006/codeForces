package day16;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        StringBuilder a=new StringBuilder(t);
        a.reverse();
        if(s.equals(a.toString())){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
