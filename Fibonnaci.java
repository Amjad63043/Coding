
public class Fibonnaci {
    public static void main(String[] args) {
        int fn0 = 0;
        int fn1 = 1;
        System.out.println(fn0);
        System.out.println(fn1);
        int result = fn0 + fn1;
        while (result < 100) {
            System.out.println(result);
            fn0 = fn1;
            fn1 = result;
            result = fn0 + fn1;

        }

    }
}
