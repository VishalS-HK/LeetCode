class Solution {
    public int countNegatives(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(matrix[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}