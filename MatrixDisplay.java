public class MatrixDisplay {
    public static void main(String[] args) {
        int[][] matrix = {
                {12, 3, 500},
                {1200, 50, 40},
                {100, 250, 8}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}