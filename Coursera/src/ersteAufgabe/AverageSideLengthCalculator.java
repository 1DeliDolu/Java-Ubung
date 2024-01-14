package ersteAufgabe;
import java.util.ArrayList;

/*public class AverageSideLengthCalculator {

    public static void main(String[] args) {
        // Coordinates of the points
        int[][] points = {
                {-3, 3},
                {-4, -3},
                {4, -2},
                {6, 5}
        };

        // Calculate average side length
        double averageSideLength = calculateAverageSideLength(points);

        // Print the result truncated to two decimal places
        System.out.printf("The average length of a side is approximately %.2f%n", averageSideLength);
    }

    private static double calculateAverageSideLength(int[][] points) {
        double totalSideLength = 0;

        for (int i = 0; i < points.length - 1; i++) {
            totalSideLength += distance(points[i][0], points[i][1], points[i + 1][0], points[i + 1][1]);
        }

        // Add the distance between the last and first points to complete the shape
        totalSideLength += distance(points[points.length - 1][0], points[points.length - 1][1], points[0][0], points[0][1]);

        // Calculate average side length
        return totalSideLength / points.length;
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}*/
