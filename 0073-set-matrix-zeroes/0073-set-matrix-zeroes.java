class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstrow=false;
        boolean firstcol=false;
        
        int m=matrix.length;
        int n=matrix[0].length;

        for(int j=0;j<n;j++){
            if(matrix[0][j]==0){
                firstrow=true;
                break;
            }
        }

        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstcol=true;
                break;
            }
        }

        // mark only at the start so that i can make alll zeros later
        // ow the whole matrix will get zeros
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        // based on markings only we make the rows,cols as zeros
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0 ){
                    matrix[i][j]=0;
                }
            }
        }
        //now fist row,col
        if(firstrow){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }

        if(firstcol){
            for(int k=0;k<m;k++){
                matrix[k][0]=0;
            }
        }
    }
}
