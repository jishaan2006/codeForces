import java.util.Scanner;

public class  Required_Remainder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long n = scanner.nextLong();

            long rem = n % x;
            long ans;

            if (rem >= y) {
                ans = n - (rem - y);
            } else {
                ans = n - rem - x + y;
            }

            System.out.println(ans);
        }
        scanner.close();
    }
}