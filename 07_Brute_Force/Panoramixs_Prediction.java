import java.util.Scanner;

public class Panoramixs_Prediction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int a = 0;

        for (int i = n + 1; i < m; i++) {
            if (isPrime(i)) {
                a++;
            }
        }

        System.out.println(a == 0 && isPrime(m) ? "YES" : "NO");
    }

    static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }

        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }
}
