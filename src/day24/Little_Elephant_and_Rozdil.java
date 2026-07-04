package day24;

import java.util.Scanner;

public class Little_Elephant_and_Rozdil {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=sc.nextInt();
        int min_index=1;
        for (int i = 1; i <n; i++) {
            int a= sc.nextInt();
            if(min==a) {
                min_index = Integer.MAX_VALUE;
            }
            if(min>a){
                min=a;
                min_index=i+1;
            }
        }
        System.out.println((min_index== Integer.MAX_VALUE)? "Still Rozdil\n" : min_index);
    }
}
