package day8;

import java.util.Scanner;

public class New_Password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        //String s="abcdefghijklmnopqrstuvwxyz";
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            ans.append((char)('a' + i % k));
        }
        System.out.println(ans);
    }
}
