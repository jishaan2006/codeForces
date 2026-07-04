package day24;

import java.util.Scanner;

public class Magic_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        if(s.charAt(0)!='1'){
            System.out.println("NO");
            return;
        }
        int count_four=0;
        for(int i=0;i< s.length();i++){
            char c=s.charAt(i);
            if(c!='1' && c!='4'){
                System.out.println("NO");
                return;
            }
            if(c=='4'){
                count_four++;
            }else{
                count_four=0;
            }
            if(count_four>2){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}