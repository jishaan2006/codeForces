import java.util.HashSet;
import java.util.Scanner;

public class Creating_Abbreviations {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int a=s.nextInt();
            int b=s.nextInt();
            HashSet<Character> set=new HashSet<>();
            for (int i = 0; i < a; i++) {
                set.add(Character.toUpperCase(s.next().charAt(0)));
            }
            boolean ans=true;
            for (int i = 0; i < b; i++) {
                String c=s.next();
                for (int j = 0; j < c.length(); j++) {
                    if(!set.contains(c.charAt(j))){
                        ans=false;
                        break;
                    }
                }
            }
            System.out.println((ans) ? "YES" : "NO");
        }
    }
}
