import java.util.Scanner;

public class Level2_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Odd / Even
        System.out.print("Enter number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++)
            System.out.println(i + (i % 2 == 0 ? " Even" : " Odd"));

        // Bonus
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years: ");
        int years = input.nextInt();

        if (years > 5)
            System.out.println("Bonus: " + salary * 0.05);
        else
            System.out.println("No Bonus");

        // Table
        System.out.print("Enter number for table: ");
        int num = input.nextInt();

        for (int i = 6; i <= 9; i++)
            System.out.println(num + " * " + i + " = " + (num * i));

        input.close();
    }
}