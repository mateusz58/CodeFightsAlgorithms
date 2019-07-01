 public static int matrixElementsSum(int[][] matrix) {
        int sum = 0;
        int i = 0;
        for (i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0 && i<matrix.length-1) {
                    matrix[i + 1][j] = 0;
                }
                sum=sum+matrix[i][j];
            }

        }
        return sum;
    }