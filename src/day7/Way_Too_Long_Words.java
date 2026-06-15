package day7;
import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
            String s=sc.next();
            if(s.length()>10){
                ans[i]=too_long(s);
            }else{
                ans[i]=s;
            }
        }
        for (String s:ans){
            System.out.println(s);
        }
    }
    static String too_long(String s) {
        return ""+s.charAt(0)+(s.length()-2)+s.charAt(s.length()-1);
    }
}
