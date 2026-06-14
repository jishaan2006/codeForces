package day6;


import java.util.Scanner;

public class Shaass_and_Oskols {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt(); //no of lines

        int[] birds =new int[n];  //input birds in lines
        for(int i=0;i<n;i++){
            birds[i]=sc.nextInt();
        }
        int m=sc.nextInt(); //no of shots fired

        for(int i=0;i<m;i++){     //location bird thats been shot
           int x=sc.nextInt()-1;     //line no
           int y=sc.nextInt();    //bird no


           int left=y-1;
           int right=birds[x]-y;

            if (x > 0) {
                birds[x - 1] += left;
            }

            if (x < n - 1) {
                birds[x + 1] += right;
            }

            birds[x] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(birds[i]);
        }
    }
}
