class MatrixCells {
    public int oddCells(int n, int m, int[][] indices) {
           int[][] matrix=new int[n][m];
           for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                   matrix[i][j]=0;
               }
           }
           int len=indices.length;
           for(int i=0;i<len;i++){
               int a=indices[i][0];
               int b=indices[i][1];
               for(int j=0;j<m;j++){
                   matrix[a][j]++;
               }
               for(int k=0;k<n;k++){
                   matrix[k][b]++;
               }
           }
        int count=0;
         for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                   if(matrix[i][j]%2!=0)
                       count++;
               }
           }
        return count;
    }
}
