package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team_Olympiad {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int programmer=0;
        int maths=0;
        int pe=0;
        List<Integer> pro_list=new ArrayList<>();
        List<Integer> math_list=new ArrayList<>();
        List<Integer> pe_list=new ArrayList<>();

        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a==1){
                programmer++;
                pro_list.add(i+1);
            } else if (a==2) {
                maths++;
                math_list.add(i+1);
            }
            else{
                pe++;
                pe_list.add(i+1);
            }
        }
        int teams=Math.min(maths,Math.min(pe,programmer));
        if(teams==0) {
            System.out.println(0);
            return;
        }
        System.out.println(teams);
        for (int i=0;i<teams;i++){
            System.out.println(math_list.get(i)+" "+pe_list.get(i)+" "+pro_list.get(i));
        }
    }
}
