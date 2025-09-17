package euro;

public class MaxSumSubMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, -1, -4, -20},
            {-8, -3, 4, 2, 1},
            {3, 8, 10, 1, 3},
            {-4, -1, 1, 7, -6}
        };

        findMaxSumSubMatrix(matrix);
    }

    public static void findMaxSumSubMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int maxSum = Integer.MIN_VALUE;

        for (int left = 0; left < cols; left++) {
            int[] temp = new int[rows];
            for (int right = left; right < cols; right++) {
                for (int i = 0; i < rows; i++) {
                    temp[i] += matrix[i][right];
                }
                int currSum = kadane(temp);
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("Maximum sum submatrix = " + maxSum);
    }

    public static int kadane(int[] arr) {
        int maxSoFar = arr[0], maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
