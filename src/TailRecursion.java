public class TailRecursion {

    public static void main(String[] args) {
        int factorial = 7;
        System.out.println("Factorial of " + factorial + " is: " + compute(factorial, 0));
    }

    private static int compute(int factorial, int floating) {
        if (floating == 0) {
            floating = factorial - 1;
            factorial *= floating;
        } else if (floating == 1) {
            return factorial;
        } else {
            floating = floating - 1;
            factorial = factorial * floating;
        }

        return compute(factorial, floating);
    }

}
