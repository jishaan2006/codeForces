package day23;

import java.util.Scanner;

public class Chat_room {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  s=sc.next();
        String compare="hello";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(c<5 && s.charAt(i)==compare.charAt(c)){
                c++;
            }
        }
        if(c==5){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
