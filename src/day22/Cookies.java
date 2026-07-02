package day22;

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cookies = new int[n];
        for (int i = 0; i < n; i++) {
            cookies[i]=sc.nextInt();
        }
        int t_sum = 0;
        for (int i : cookies) {
            t_sum += i;
        }
        for (int i = 0; i < n; i++) {
            cookies[i]=t_sum-cookies[i];
        }
        int count=0;
        for(int i:cookies){
            if(i%2==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
