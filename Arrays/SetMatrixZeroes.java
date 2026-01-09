class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;//rows
        int n= matrix[0].length;//colums
        boolean firstRow=false;
        boolean firstCol=false;
        //first col
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstCol=true;
                break;
            }
        }
        //first row
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0){
                firstRow=true;
                break;
            }

        }
        // mark rows and colums
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if((matrix[i][0]==0) || (matrix[0][j]==0)){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstCol){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
        if(firstRow){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }

    }
}
