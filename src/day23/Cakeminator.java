package day23;

import java.util.Scanner;

public class Cakeminator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        char[][] board=new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < m; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        boolean[] safeRow=new boolean[n];
        boolean[] safeCol=new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j]=='S'){
                    safeRow[i]=true;
                    safeCol[j]=true;
                }
            }
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!safeRow[i] || !safeCol[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
