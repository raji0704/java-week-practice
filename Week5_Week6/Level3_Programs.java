import java.util.Scanner;

public class Level3_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++){
            numbers[i] = input.nextInt();
            sum = sum + numbers[i];
        }

        System.out.println("Sum = " + sum);

        input.close();
    }
}