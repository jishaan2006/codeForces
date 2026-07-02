package day22;

import java.util.Arrays;
import java.util.Scanner;

public class Business_trip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr=new int[12];
        if(k==0){
            System.out.println("0");
            return;
        }
        for (int i = 0; i < 12; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for (int i =11; i >=0; i--) {
            sum+=arr[i];
            if(sum>=k){
                System.out.println(12-i);
                return;
            }
        }
        System.out.println("-1");
    }
}
