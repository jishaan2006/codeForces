package day41;

import java.util.Scanner;

public class Target_Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int total=0;
            char[][] board=new char[10][10];
            for (int i = 0; i < 10; i++) {
                String s= sc.next();
                for (int j = 0; j < 10; j++) {
                    board[i][j]=s.charAt(j);
                    if (board[i][j] == 'X') {
                        int layer = Math.min(Math.min(i, j), Math.min(9 - i, 9 - j));
                        total += layer + 1;
                    }
                }
            }
            System.out.println(total);

        }
    }
}
