package day24;
import java.util.Scanner;
public class T_primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            long x = sc.nextLong();
            long root = (long) Math.sqrt(x);
            if (root * root == x && isPrime(root)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}