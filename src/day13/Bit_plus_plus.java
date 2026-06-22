package day13;
import java.util.Scanner;
public class Bit_plus_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            if(s.contains("+")) {
                ans++;
            } else {
                ans--;
            }
        }
        System.out.println(ans);
    }
}