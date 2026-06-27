package day17;

import java.util.Scanner;

public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rooms=0;
        for(int i=0;i<n;i++){
            int people= sc.nextInt();
            int quantity=sc.nextInt();
            if(quantity-people>=2){
                rooms++;
            }
        }
        System.out.println(rooms);
    }
}
