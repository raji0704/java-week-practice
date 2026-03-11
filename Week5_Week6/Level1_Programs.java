import java.util.Scanner;

public class Level1_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // -------------------------------
        // Program 1: Check Voting Eligibility
        // -------------------------------

        int[] ages = new int[10];

        System.out.println("Enter ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("Invalid age");
            }
            else if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote");
            }
            else {
                System.out.println("Student with age " + ages[i] + " cannot vote");
            }
        }

        // -------------------------------
        // Program 2: Positive/Negative/Zero + Even/Odd
        // -------------------------------

        int[] numbers = new int[5];

        System.out.println("\nEnter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {

                if (numbers[i] % 2 == 0)
                    System.out.println(numbers[i] + " is positive and even");
                else
                    System.out.println(numbers[i] + " is positive and odd");

            }
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative");
            }
            else {
                System.out.println("Number is zero");
            }
        }

        // Compare first and last element
        if (numbers[0] == numbers[4])
            System.out.println("First and last numbers are equal");
        else if (numbers[0] > numbers[4])
            System.out.println("First number is greater than last");
        else
            System.out.println("First number is less than last");

        // -------------------------------
        // Program 3: Multiplication Table
        // -------------------------------

        System.out.println("\nEnter a number for multiplication table:");
        int num = input.nextInt();

        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i-1] = num * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + table[i-1]);
        }

        input.close();
    }
}