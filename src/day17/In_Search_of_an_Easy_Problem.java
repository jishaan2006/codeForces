package day17;

import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int q=s.nextInt();
            if(q==1){
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}
