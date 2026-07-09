package day29;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] nums=new int[n];
            for (int i = 0; i < n; i++) {
                nums[i]=sc.nextInt();
            }
            boolean yes=true;
            Arrays.sort(nums);
            for (int i = 1; i <n; i++) {
                if(nums[i]-nums[i-1]>1){
                    yes=false;
                }
            }
            System.out.println(yes? "YES":"NO");
        }
    }
}
