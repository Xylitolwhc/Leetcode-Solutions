/**
 * Created by Hanson on 2019/4/21
 *
 * @author Hanson
 * 2019/4/22
 * 812. Largest Triangle Area
 * https://leetcode.com/problems/largest-triangle-area/
 */
public class Solution_812 {
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    double area = calArea(points[i], points[j], points[k]);
                    if (area > max) max = area;
                }
            }
        }
        return max;
    }

    private double calArea(int[] point1, int[] point2, int[] point3) {
        return Math.abs(0.5 * (point1[0] * point2[1] - point2[0] * point1[1]
                + point2[0] * point3[1] - point3[0] * point2[1]
                + point3[0] * point1[1] - point1[0] * point3[1]));
    }
}
