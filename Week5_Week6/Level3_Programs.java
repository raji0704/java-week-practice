import java.util.Scanner;

public class Level3_Programs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] freq = new int[10];   // Array to store frequency of digits 0-9

        while (num > 0) {
            int digit = num % 10;   // Get last digit
            freq[digit]++;          // Increase frequency
            num = num / 10;         // Remove last digit
        }

        System.out.println("Frequency of digits:");

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " : " + freq[i]);
            }
        }

        sc.close();
    }
}