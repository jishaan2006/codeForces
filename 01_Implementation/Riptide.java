import java.util.Arrays;
import java.util.Scanner;

public class Riptide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int[] arr=new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i]=sc.nextInt();
            }
            int rounds=0;
            Arrays.sort(arr);
            while (arr[1]!=arr[2] && arr[0]!=arr[1]){
                arr[0]+=1;
                arr[2]-=1;
                rounds++;
            }
            System.out.println(rounds);
        }
    }
}
