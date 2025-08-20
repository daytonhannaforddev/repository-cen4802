public class Fibonacci {

    /**
     * Returns the nth term in the Fibonacci sequence using recursion.
     *
     * @param n is the position in the Fibonacci sequence (0-based index)
     * @return 'y' the nth Fibonacci number
     */

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int n = 10;
        int y = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + y + ".");
    }
}
