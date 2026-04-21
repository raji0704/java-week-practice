import java.util.Scanner;

public class Level2_Programs {

    // Q1: Find length without using length()
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // when index out of range
        }

        return count;
    }

    // Count number of words
    public static int countWords(String text) {
        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

    // Split text manually using charAt()
    public static String[] splitText(String text) {

        int words = countWords(text);
        String[] result = new String[words];

        int start = 0;
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {
                result[index] = text.substring(start, i);
                index++;
                start = i + 1;
            }
        }

        // last word
        result[index] = text.substring(start);

        return result;
    }

    // Compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Week 9 - Level 3 Programs");
        System.out.println("1. Find string length without length()");
        System.out.println("2. Split text into words");
        System.out.print("Enter your choice (1-2): ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                // Q1
                System.out.print("Enter string: ");
                String str = sc.next();

                int userLength = findLength(str);
                int builtLength = str.length();

                System.out.println("Using charAt(): " + userLength);
                System.out.println("Using length(): " + builtLength);

                if (userLength == builtLength) {
                    System.out.println("Both results are same.");
                } else {
                    System.out.println("Results are different.");
                }
                break;

            case 2:
                // Q2
                System.out.print("Enter sentence: ");
                String text = sc.nextLine();

                String[] userSplit = splitText(text);
                String[] builtSplit = text.split(" ");

                System.out.print("User-defined split: ");
                for (String word : userSplit) {
                    System.out.print(word + " ");
                }
                System.out.println();

                System.out.print("Built-in split: ");
                for (String word : builtSplit) {
                    System.out.print(word + " ");
                }
                System.out.println();

                boolean result = compareArrays(userSplit, builtSplit);

                if (result) {
                    System.out.println("Both results are same.");
                } else {
                    System.out.println("Results are different.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}