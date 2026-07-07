package day27;

import java.util.Scanner;

public class Pashmak_and_Garden {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2= sc.nextInt();
        if(Math.abs(y1-y2)==0){
            //horizontal side
            int d=Math.abs(x1-x2);
            int x3=x1;
            int x4=x2;
            int y3=y1+d;
            int y4=y2+d;
            System.out.println(x3+" "+y3+" "+x4+" "+y4);
        } else if (Math.abs(x1-x2)==0) {
            //vertical side
            int d=Math.abs(y1-y2);
            int x3=x1+d;
            int x4=x2+d;
            int y3=y1;
            int y4=y2;
            System.out.println(x3+" "+y3+" "+x4+" "+y4);
        }else if(Math.abs(x1-x2)==Math.abs(y1-y2)){
            //diagonal
            int x3=x1;
            int x4=x2;
            int y3=y2;
            int y4=y1;
            System.out.println(x3+" "+y3+" "+x4+" "+y4);
        }else{
            System.out.println(-1);
        }
    }
}
