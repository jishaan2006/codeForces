package day3;

import java.util.Scanner;

public class Black_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int a1=sc.nextInt();
//        int a2=sc.nextInt();
//        int a3=sc.nextInt();
//        int a4=sc.nextInt();
        int[] calories = new int[4];

        for (int i = 0; i < 4; i++) {
            calories[i] = sc.nextInt();
        }
        String s= sc.next();
        int total=0;
//        for(int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            switch (c){
//                case '1':total+=a1;
//                    break;
//                case '2':total+=a2;
//                    break;
//                case '3':total+=a3;
//                    break;
//                case '4':total+=a4;
//                    break;
//            }
//        }


        for (int i = 0; i < s.length(); i++) {
            total += calories[s.charAt(i) - '1'];
        }
        System.out.println(total);
    }
}
