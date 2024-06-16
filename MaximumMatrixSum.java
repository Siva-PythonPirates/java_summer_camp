import java.util.*;

public class MaximumMatrixSum {
    // Function to check if two elements are adjacent
    private static boolean isAdjacent(int[][] matrix, int i1, int j1, int i2, int j2) {
        return Math.abs(i1 - i2) <= 1 && Math.abs(j1 - j2) <= 1;
    }

    // Function to find the maximum sum of 3 non-adjacent elements
    public static int maxSumNonAdjacent(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        int[] bestElements = new int[3];

        for (int i1 = 0; i1 < 3; i1++) {
            for (int j1 = 0; j1 < 3; j1++) {
                for (int i2 = 0; i2 < 3; i2++) {
                    for (int j2 = 0; j2 < 3; j2++) {
                        if (isAdjacent(matrix, i1, j1, i2, j2)) {
                            continue;
                        }
                        for (int i3 = 0; i3 < 3; i3++) {
                            for (int j3 = 0; j3 < 3; j3++) {
                                if (isAdjacent(matrix, i1, j1, i3, j3) || isAdjacent(matrix, i2, j2, i3, j3)) {
                                    continue;
                                }
                                int currentSum = matrix[i1][j1] + matrix[i2][j2] + matrix[i3][j3];
                                if (currentSum > maxSum) {
                                    maxSum = currentSum;
                                    bestElements[0] = matrix[i1][j1];
                                    bestElements[1] = matrix[i2][j2];
                                    bestElements[2] = matrix[i3][j3];
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Elements contributing to the maximum sum: " + Arrays.toString(bestElements));
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = maxSumNonAdjacent(matrix);
        System.out.println("Maximum sum of 3 non-adjacent elements: " + result);
    }
}
