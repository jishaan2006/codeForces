package day3;

import java.util.Scanner;

public class Night_at_the_Museum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        int rotations=0;
        int position=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int target=c -'a';
            rotations+=diff(position,target);
            position=target;
        }
        System.out.println(rotations);
    }
    static int diff(int pos,int target){
        int d=Math.abs(pos-target);
        return Math.min(d,26-d);
    }
}
