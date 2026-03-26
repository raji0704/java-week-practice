import java.util.Scanner;

public class Level2_Programs {

    // Question 1: Find factors and store in array
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array with factor count
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    public static long findProduct(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    public static double findSumOfSquares(int[] factors) {
        double sumSquares = 0;
        for (int i = 0; i < factors.length; i++) {
            sumSquares += Math.pow(factors[i], 2);
        }
        return sumSquares;
    }

    public static void question1(Scanner sc) {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int[] factors = findFactors(number);

        System.out.print("Factors are: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        int sum = findSum(factors);
        long product = findProduct(factors);
        double sumSquares = findSumOfSquares(factors);

        System.out.println("Sum of factors = " + sum);
        System.out.println("Product of factors = " + product);
        System.out.println("Sum of squares of factors = " + sumSquares);
    }

    // Question 2: Sum of n natural numbers using recursion
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void question2(Scanner sc) {
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("It is not a natural number.");
            return;
        }

        int recursiveResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        System.out.println("Sum using recursion = " + recursiveResult);
        System.out.println("Sum using formula = " + formulaResult);

        if (recursiveResult == formulaResult) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Level 2 Practice Programs");
        System.out.println("1. Factors of a number using array");
        System.out.println("2. Sum of n natural numbers using recursion");
        System.out.print("Enter your choice (1-2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                question1(sc);
                break;

            case 2:
                question2(sc);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
