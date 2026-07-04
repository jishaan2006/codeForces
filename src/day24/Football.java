package day24;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1)==s.charAt(i)){
                count++;
            }else{
                count=1;
            }
            if(count>=7){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
