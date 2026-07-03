package day23;

import java.util.Scanner;

public class IQ_test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd_index=0;
        int even_index=0;
        int even=0;
        int odd=0;
        for (int i = 0; i < n; i++) {
            int t= sc.nextInt();
            if(t%2==0){
                even_index=i+1;
                even++;
            }else{
                odd_index=i+1;
                odd++;
            }
        }
        System.out.println((even==1)? even_index:odd_index);
    }
}
