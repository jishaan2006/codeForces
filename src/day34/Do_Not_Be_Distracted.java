package day34;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Do_Not_Be_Distracted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            boolean sus=false;
            int n=sc.nextInt();
            String s=sc.next();
            HashSet<Character> set=new HashSet<>();
            for (int i = 0; i <n; i++) {
                char curr=s.charAt(i);
                if (i == 0 || curr != s.charAt(i - 1)) {
                    if (set.contains(curr)) {
                        sus=true;
                    }
                    set.add(curr);
                }

            }
            System.out.println(sus? "NO" : "YES");
        }
    }
}
