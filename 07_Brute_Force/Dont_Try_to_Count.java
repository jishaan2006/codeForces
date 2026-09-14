import java.util.Scanner;

public class Dont_Try_to_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String x= sc.next();
            String s= sc.next();
            int ans = 0;
            while (x.length() < s.length()) {
                x += x;
                ans++;
            }
            if (x.contains(s)) {
                System.out.println(ans);
            } else if ((x + x).contains(s)) {
                System.out.println(ans + 1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
