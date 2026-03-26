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
        int tallest = findTallest(heights);

        System.out.println("Sum of heights = " + sum + " cm");
        System.out.println("Mean height = " + mean + " cm");
        System.out.println("Shortest height = " + shortest + " cm");
        System.out.println("Tallest height = " + tallest + " cm");
    }
}