package day7;

import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int one=0;
        int two=0;
        int three =0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)=='1'){
                one++;
            } else if (s.charAt(i)=='2') {
                two++;
            }else if(s.charAt(i)=='3'){
                three++;
            }
        }
        StringBuilder a=new StringBuilder();
        while(one-->0){
            a.append("1+");
        }
        while(two-->0){
            a.append("2+");
        }
        while (three-->0){
            a.append("3+");
        }
        a.deleteCharAt(a.length() - 1);
        System.out.println(a.toString());
    }
}
