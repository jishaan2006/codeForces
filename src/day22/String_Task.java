package day22;

import java.util.Scanner;

public class String_Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray()){
            c=Character.toLowerCase(c);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y') {
                ans.append("."+c);
            }
        }
        System.out.println(ans);
    }
}
