import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number::");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number::");
        int num2 = sc.nextInt();
        sc.close();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("_______After Swap______");
        System.out.println("_______1 st number______" + num1);
        System.out.println("_______2nd number______" + num2);

    }
}