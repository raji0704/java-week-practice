import java.util.Random;

public class Level3_Programs {

    // Method to generate random heights
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random random = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // 150 to 250
        }

        return heights;
    }

    // Method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }

        return shortest;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        System.out.println("Level 3 Practice Programs");
        System.out.println("1. Find shortest, tallest and mean height of football players");

        int[] heights = generateHeights();

        System.out.print("Heights of 11 players (in cm): ");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println();

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
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