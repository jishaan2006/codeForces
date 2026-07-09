package day29;

import java.util.Scanner;

public class Codeforces_Checking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="codeforces";
        for (int i = 0; i < n; i++) {
            char c=sc.next().charAt(0);
            if(s.indexOf(c)==-1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
