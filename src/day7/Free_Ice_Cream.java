package day7;

import java.util.Scanner;

public class Free_Ice_Cream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long x=sc.nextLong();
        int distressed=0;
        for(int i=0;i<n;i++){
            String sign=sc.next();
            long ice_cream=sc.nextLong();
            if(sign.equals("-")){
                if(x<ice_cream){
                    distressed++;
                }else{
                    x-=ice_cream;
                }
            }else{
                x+=ice_cream;
            }
        }
        System.out.println(x+" "+distressed);
    }
}
