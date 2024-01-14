package ersteAufgabe;
public class LongestSideCalculator {

    /*public static void main(String[] args) {
        // Coordinates of the points
        int[][] points = {
                {-3, 9},
                {-8, 7},
                {-12, 4},
                {-6, -2},
                {-4, -6},
                {2, -8},
                {6, -5},
                {10, -3},
                {8, 5},
                {4, 8}
        };

        // Calculate the longest side
        double longestSide = calculateLongestSide(points);

        // Print the result truncated to two decimal places
        System.out.printf("The longest side is approximately %.2f%n", longestSide);
    }

    private static double calculateLongestSide(int[][] points) {
        double longestSide = 0;

        for (int i = 0; i < points.length - 1; i++) {
            double currentSide = distance(points[i][0], points[i][1], points[i + 1][0], points[i + 1][1]);
            longestSide = Math.max(longestSide, currentSide);
        }

        // Check the distance between the last and first points to complete the shape
        double lastSide = distance(points[points.length - 1][0], points[points.length - 1][1], points[0][0], points[0][1]);
        longestSide = Math.max(longestSide, lastSide);

        return longestSide;
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }*/
}