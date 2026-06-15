package day7;

import java.util.Scanner;

public class Carrot_Cakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();     //number of cakes
        int t = sc.nextInt();    //time needed for one oven to bake k cakes
        int k = sc.nextInt();     //number of cakes baked at the same time
        int d = sc.nextInt();     //time needed to build second oven.

        int time_One=(n+k-1/k)*t;
        int cakes=0;

        for(int time=0;time<time_One;time++){
            cakes=(time/t)*k;
            if(time>d){
                cakes += ((time - d) / t) * k;
            }
            if(cakes>=n){
                System.out.println("YES");
                return;
            }
            System.out.println("NO");
        }
    }
}
