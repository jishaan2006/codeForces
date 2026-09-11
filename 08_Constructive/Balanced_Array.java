import java.util.Scanner;

public class Balanced_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = n / 2;

            if (k % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            // Even numbers
            for (int i = 1; i <= k; i++) {
                System.out.print(2 * i + " ");
            }

            // First k-1 odd numbers
            for (int i = 1; i < k; i++) {
                System.out.print(2 * i - 1 + " ");
            }

            // Remaining odd number
            System.out.println(3 * k - 1);
        }
    }
}