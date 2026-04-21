import java.util.Scanner;

public class Level3_Programs {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // stops when index is out of range
        }

        return count;
    }

    // Method to find unique characters
    public static char[] findUniqueChars(String text) {

        int len = findLength(text);
        char[] temp = new char[len];   // step (i)
        int index = 0;

        // step (ii): nested loop
        for (int i = 0; i < len; i++) {

            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index] = current;
                index++;
            }
        }

        // step (iii): final array
        char[] result = new char[index];

        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Week 10 - Level 3 Program");
        System.out.print("Enter string: ");
        String text = sc.next();

        char[] uniqueChars = findUniqueChars(text);

        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}