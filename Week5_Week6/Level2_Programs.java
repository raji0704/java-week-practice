import java.util.Scanner;

public class Level2_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // --------------------------------
        // Program 1: Bonus of 10 Employees
        // --------------------------------

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        System.out.println("Enter salary and years of service for 10 employees:");

        for (int i = 0; i < 10; i++) {

            System.out.print("Salary of employee " + (i+1) + ": ");
            salary[i] = input.nextDouble();

            System.out.print("Years of service: ");
            years[i] = input.nextDouble();

            if (salary[i] < 0 || years[i] < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }
        }

        for (int i = 0; i < 10; i++) {

            if (years[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);


        // --------------------------------
        // Program 2: Youngest & Tallest Friend
        // --------------------------------

        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        System.out.println("\nEnter age and height of 3 friends:");

        for (int i = 0; i < 3; i++) {

            System.out.print("Age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Height of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {

            if (ages[i] < ages[youngestIndex])
                youngestIndex = i;

            if (heights[i] > heights[tallestIndex])
                tallestIndex = i;
        }

        System.out.println("\nYoungest friend: " + names[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex]);

        input.close();
    }
}