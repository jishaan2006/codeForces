package day27;

import java.util.Scanner;

public class Fox_And_Two_Dots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] board = new char[n][m];
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s=sc.next();
            for (int j = 0; j < m; j++) {
                board[i][j]=s.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    if (cycleDfs(board, i, j, -1, -1, visited)) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }
        System.out.println("No");

    }

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};


    static boolean cycleDfs(
            char[][] board,
            int row,
            int col,
            int parentRow,
            int parentCol,
            boolean[][] visited
    ) {
        visited[row][col]=true;

        for (int i = 0; i < 4; i++) {
            int nr = row + dr[i];
            int nc = col + dc[i];

            if (nr < 0 || nc < 0 || nr >= board.length || nc >= board[0].length) {
                continue;
            }
            if (board[nr][nc] != board[row][col]) {
                continue;
            }
            if (nr==parentRow && nc==parentCol) {
                continue;
            }
            if (visited[nr][nc]) {
                return true;
            } else {
                if (cycleDfs(board, nr, nc, row, col, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
