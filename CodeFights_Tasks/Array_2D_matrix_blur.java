//My solution
int[][] boxBlur(int[][] image) {
        int x=0;
        int y=0;
        int result[][]=new int[image.length-2][image[0].length-2];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++)
            {
                if((i!=0 && i!=image.length-1)&&(j!=0 && j!=image[0].length-1))
                {
                    int sum=0;
                     int count=0;
                    for (int ii = i-1; ii < (i-1)+3; ii++) {
                        for (int jj = j-1; jj < (j-1)+3; jj++)
                        {
                            sum=sum+image[ii][jj];
                            count++;}

                    }
                    if(y==image[0].length-2){y=0;x++;}
                    if(x==image.length-2){break;}
                    result[x][y]=sum/count;y++;

                }
            }
        }
//display(result);
        return result;
    }


//Better solution
int[][] boxBlur(int[][] image) {
    int blurred[][] = new int[image.length - 2][image[0].length - 2];
    int tmp = 0;
    for (int y = 0; y < blurred.length; y++)
    {
        for (int x = 0; x < blurred[y].length; x++)
        {
            tmp = 0;
            tmp += image[y + 0][x + 0];
            tmp += image[y + 1][x + 0];
            tmp += image[y + 2][x + 0];
            tmp += image[y + 0][x + 1];
            tmp += image[y + 1][x + 1];
            tmp += image[y + 2][x + 1];
            tmp += image[y + 0][x + 2];
            tmp += image[y + 1][x + 2];
            tmp += image[y + 2][x + 2];
            blurred[y][x] = tmp / 9;
        }
    }
    return blurred;
}





