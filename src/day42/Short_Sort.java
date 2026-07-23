package day42;

import java.util.Scanner;

public class Short_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            String a="abc";
            int c=0;
            for (int i = 0; i < 3; i++) {
                if(a.charAt(i)!=s.charAt(i)){
                    c++;
                }
            }
            System.out.println(c<=2? "YES":"NO");
        }
    }
}
