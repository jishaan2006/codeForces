package day20;

import java.util.Scanner;

public class New_Year_and_Hurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ques = sc.nextInt();
        int k = sc.nextInt();

        int time_available = 240 - k;
        int solved = 0;
        int i = 1;

        while (i <= ques && 5 * i <= time_available) {
            time_available -= 5 * i;
            solved++;
            i++;
        }

        System.out.println(solved);
    }
}
