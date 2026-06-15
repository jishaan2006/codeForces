package day7;


import java.util.Scanner;

public class Anton_and_Letters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int freq[] =new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            }
        }
        int c=0;
        for(int i:freq){
            if(i!=0){
                c++;
            }
        }
        System.out.println(c);

    }
}
