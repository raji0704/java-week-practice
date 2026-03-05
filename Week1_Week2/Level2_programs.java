import java.util.Scanner;

public class Level2_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Triangle Area
        System.out.print("Enter base: ");
        double base = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        System.out.println("Triangle Area: " + (0.5 * base * height));

        // Square Side
        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();

        System.out.println("Square side: " + (perimeter / 4));

        input.close();
    }
}