
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number::");
        int num = sc.nextInt();
        sc.close();

        // int num = 5;
        int res = 1;
        for (int i = num; i > 1; i--) {
            res *= i;

        }
        System.out.println(res);

    }

}
