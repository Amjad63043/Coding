import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number::");
        int num = sc.nextInt();
        sc.close();
        boolean isprime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }

        }
        if (isprime) {
            System.out.println(num + " IS prime");
        } else {
            System.out.println(num + " is not prime");
        }

    }

}
