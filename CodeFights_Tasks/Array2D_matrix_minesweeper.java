int[][] minesweeper(boolean[][] matrix) {

    int[][] m = new int[matrix.length][];
    for(int i=0; i<matrix.length; i++)
        m[i] = new int [matrix[i].length];
    
    for(int i=0; i<matwrix.length; i++)
        for(int j=0; j<matrix[0].length; j++){
            for(int k=i-1; k<i+2; k++)
                for(int l=j-1; l<j+2; l++)
                    if(k>=0 && k<matrix.length && l>=0 && l<matrix[i].length && 
                      !(k==i && j==l) && matrix[k][l])
                        m[i][j]++;
        }
    
    return m;
}

