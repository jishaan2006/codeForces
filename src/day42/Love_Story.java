package day42;

import java.util.Scanner;

public class Love_Story {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            String a="codeforces";
            int c=0;
            for (int i = 0; i <10 ; i++) {
                if(a.charAt(i)!=s.charAt(i)){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
