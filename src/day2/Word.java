package day2;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(UpperOrLower(s)){
            System.out.println(s.toLowerCase());
        }else{
            System.out.println(s.toUpperCase());
        }
    }
    static boolean UpperOrLower(String s){
        int upper_count=0,lower_count=0;
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                upper_count++;
            }else{
                lower_count++;
            }
        }
        return lower_count>=upper_count;
    }
}
