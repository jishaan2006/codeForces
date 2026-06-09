package Day1;

import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>s2.charAt(i)){
                System.out.println("1");
                return;
            }
            if(s1.charAt(i)<s2.charAt(i)){
                System.out.println("-1");
                return;
            }
        }
        System.out.println("0");
    }
}
