package day18;

import java.util.Scanner;

public class Fox_And_Snake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean right=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if((i+1)%2!=0){
                    System.out.print("#");
                }else{
                    if(right){
                        if(j==m-1){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }else {
                        if(j==0){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }
                }
            }
            if ((i + 1) % 2 == 0) {
                right = !right;
            }
            System.out.println();
        }
    }
}
