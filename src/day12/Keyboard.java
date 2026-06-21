package day12;

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String alphabets="qwertyuiopasdfghjkl;zxcvbnm,./";
        char c = sc.next().charAt(0);
        String words=sc.next();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<words.length();i++){
            if(c=='R'){
                char ch=words.charAt(i);
                ans.append(alphabets.charAt(alphabets.indexOf(ch)-1));
            }else{
                char ch=words.charAt(i);
                ans.append(alphabets.charAt(alphabets.indexOf(ch)+1));
            }
        }
        System.out.println(ans);
    }
}
