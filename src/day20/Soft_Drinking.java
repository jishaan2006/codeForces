package day20;

import java.util.Scanner;

public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // no of friends
        int k=sc.nextInt(); // no of bottles
        int l=sc.nextInt(); //Each bottle has l milliliters of the drink
        int c=sc.nextInt(); //no of limes
        int d=sc.nextInt(); //no of slices of each lime
        int p=sc.nextInt(); //gms of salt
        int nl=sc.nextInt(); // each friend needs nl milliliters of the drink
        int np=sc.nextInt(); //each needs np grams of salt.
        int total_drink=k*l;
        int total_toast=total_drink/nl;
        int lime_slices=c*d;
        int total_salt=p/np;
        System.out.println((Math.min(total_toast,Math.min(lime_slices,total_salt)))/n);
    }
}
