import java.util.Scanner;
// program to check if three points are collinear using slope and area methods
public class SlopeAndArea {
    private static final double EPSILON = 1e-9;
// compute slope between two points
    private static Double computeSlope(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        if (Math.abs(dx) < EPSILON)
            return Math.abs(dy) < EPSILON ? null : Double.POSITIVE_INFINITY;
        return dy / dx;
    }
// compare two slopes for equality
    private static boolean slopesEqual(Double first, Double second) {
        if (first == null || second == null)
            return first == null && second == null;
        return Math.abs(first - second) < EPSILON;
    }
// check collinearity using slope method
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        Double slopeAB = computeSlope(x1, y1, x2, y2);
        Double slopeBC = computeSlope(x2, y2, x3, y3);
        Double slopeAC = computeSlope(x1, y1, x3, y3);
        return slopesEqual(slopeAB, slopeBC) && slopesEqual(slopeBC, slopeAC);
    }
// check collinearity using area method
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < EPSILON;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        boolean slopeCheck = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaCheck = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("slope formula: " + slopeCheck);
        System.out.println("area formula: " + areaCheck);
        if (slopeCheck && areaCheck)
            System.out.println("points are collinear.");
        else
            System.out.println("points are not collinear.");
    }
}

