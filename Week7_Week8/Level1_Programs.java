import java.util.Scanner;

public class Level1_Programs {

    // Method for Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // Method for Handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    // Method for Triangular Park Rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km = 5000 meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Level 1 Practice Programs");
        System.out.println("1. Simple Interest");
        System.out.println("2. Maximum Handshakes");
        System.out.println("3. Athlete 5 KM Run in Triangular Park");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Simple Interest
                System.out.print("Enter Principal: ");
                double principal = sc.nextDouble();

                System.out.print("Enter Rate of Interest: ");
                double rate = sc.nextDouble();

                System.out.print("Enter Time: ");
                double time = sc.nextDouble();

                double simpleInterest = calculateSimpleInterest(principal, rate, time);

                System.out.println("The Simple Interest is " + simpleInterest +
                        " for Principal " + principal +
                        ", Rate of Interest " + rate +
                        " and Time " + time);
                break;

            case 2:
                // Handshakes
                System.out.print("Enter the number of students: ");
                int numberOfStudents = sc.nextInt();

                int handshakes = calculateHandshakes(numberOfStudents);

                System.out.println("The maximum number of possible handshakes is: " + handshakes);
                break;

            case 3:
                // Triangular Park Run
                System.out.print("Enter side 1 of triangle (in meters): ");
                double side1 = sc.nextDouble();

                System.out.print("Enter side 2 of triangle (in meters): ");
                double side2 = sc.nextDouble();

                System.out.print("Enter side 3 of triangle (in meters): ");
                double side3 = sc.nextDouble();

                double rounds = calculateRounds(side1, side2, side3);

                System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to finish 5 km run.");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}