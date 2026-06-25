package day16;

import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int h=s.nextInt();
        int width=0;
        for(int i=0;i<n;i++){
            int hi=s.nextInt();
            if(hi<=h){
                width++;
            }else{
                width+=2;
            }
        }
        System.out.println(width);
    }
}
