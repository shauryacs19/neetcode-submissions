class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            for(int i = 0 ; i < matrix[0].length ; i++){
                if(matrix[mid][i] == target) return true;
                if(target > matrix[mid][i]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
