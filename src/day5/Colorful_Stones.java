package day5;

import java.util.Scanner;

public class Colorful_Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int position=1;
        int j=0;
        for(int i=0;i<t.length();i++){
            if(j< s.length() && s.charAt(j)==t.charAt(i)){
                position++;
                j++;
            }
        }
        System.out.println(position);
    }
}
