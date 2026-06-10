package day2;
import java.util.Scanner;

public class Boy_Or_Girl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        if(BoyOrGirl(s)){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
    static boolean BoyOrGirl(String s){
        int[] freq=new int[26];
        int count=0;
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(int a:freq){
            if(a!=0){
                count++;
            }
        }
        return count%2==0;
    }
}
