import java.util.Arrays;
import java.util.Scanner;

public class Spell_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        char[] arr = {'T', 'i', 'm', 'u', 'r'};
        Arrays.sort(arr);

        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();

            if (n != 5) {
                System.out.println("NO");
            } else {
                char[] inarr = a.toCharArray();
                Arrays.sort(inarr);

                System.out.println(Arrays.equals(arr, inarr) ? "YES" : "NO");
            }
        }
    }
}