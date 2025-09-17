package euro;

public class saddlepoint {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 1},
            {7, 8, 9}
        };

        findSaddlePoint(matrix);
    }

    public static void findSaddlePoint(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int rowMin = matrix[i][0];
            int colIndex = 0;

            // Find min in the row
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }

            // Check if it's the max in its column
            boolean isSaddle = true;
            for (int k = 0; k < n; k++) {
                if (matrix[k][colIndex] > rowMin) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle Point found: " + rowMin);
                return;
            }
        }
        System.out.println("No Saddle Point found");
    }
}
