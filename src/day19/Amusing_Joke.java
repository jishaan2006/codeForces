package day19;

import java.util.Arrays;
import java.util.Scanner;

public class Amusing_Joke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        if(s1.length()+s2.length()!=s3.length()){
            System.out.println("NO");
            return;
        }
        int[] freq12=new int[26];
        int[] freq3=new int[26];
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            freq12[c-'A']++;
        }
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            freq12[c-'A']++;
        }
        for(int i=0;i<s3.length();i++){
            char c=s3.charAt(i);
            freq3[c-'A']++;
        }
        if(Arrays.equals(freq12,freq3)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
