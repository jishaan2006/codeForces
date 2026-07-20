package day39;

import java.util.ArrayList;
import java.util.Scanner;

public class Dislike_of_Threes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int num = 1;
        while (list.size() < 1000) {
            if (num % 3 != 0 && num % 10 != 3) {
                list.add(num);
            }
            num++;
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            System.out.println(list.get(k - 1));
        }
    }
}