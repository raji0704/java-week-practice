import java.util.Scanner;

public class Level1_Programs {

    // Q1: Compare strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Q2: Create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Q3: Convert string to char array manually
    public static char[] getCharacters(String text) {
        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }

        return arr;
    }

    // Compare two char arrays
    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Week 9 - Level 1 Programs");
        System.out.println("1. Compare two strings");
        System.out.println("2. Create substring");
        System.out.println("3. String to char array");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                // Q1
                System.out.print("Enter first string: ");
                String s1 = sc.next();

                System.out.print("Enter second string: ");
                String s2 = sc.next();

                boolean userResult = compareStrings(s1, s2);
                boolean builtInResult = s1.equals(s2);

                System.out.println("Using charAt(): " + userResult);
                System.out.println("Using equals(): " + builtInResult);

                if (userResult == builtInResult) {
                    System.out.println("Both results are same.");
                } else {
                    System.out.println("Results are different.");
                }
                break;

            case 2:
                // Q2
                System.out.print("Enter string: ");
                String text = sc.next();

                System.out.print("Enter start index: ");
                int start = sc.nextInt();

                System.out.print("Enter end index: ");
                int end = sc.nextInt();

                String userSub = createSubstring(text, start, end);
                String builtSub = text.substring(start, end);

                System.out.println("Using charAt(): " + userSub);
                System.out.println("Using substring(): " + builtSub);

                if (userSub.equals(builtSub)) {
                    System.out.println("Both substrings are same.");
                } else {
                    System.out.println("Substrings are different.");
                }
                break;

            case 3:
                // Q3
                System.out.print("Enter string: ");
                String str = sc.next();

                char[] userArr = getCharacters(str);
                char[] builtArr = str.toCharArray();

                System.out.print("User-defined array: ");
                for (char c : userArr) {
                    System.out.print(c + " ");
                }
                System.out.println();

                System.out.print("Built-in array: ");
                for (char c : builtArr) {
                    System.out.print(c + " ");
                }
                System.out.println();

                boolean arrayResult = compareArrays(userArr, builtArr);

                if (arrayResult) {
                    System.out.println("Both arrays are same.");
                } else {
                    System.out.println("Arrays are different.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}