package Lab9;

public class Exponent {

    public static void main(String[] args) {
        System.out.println(exponent(10, 3));
        System.out.println(exponent(2, 8));
        System.out.println(exponent(5, 3));
    }

    public static long exponent(int x, int m) {
        // Base case
        if (m == 0) {
            return 1;
        }
        // Recursive case
        return (x * exponent(x, --m));
    }
    /*
     10 * exponent(10, 2) -> 10 * 10 * exponent(10, 1) -> 10 * 10 * 10 * 1
     */
}