class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftPrefix = new int[n];
        leftPrefix[0] = 1;

        for(int i = 1 ; i < n ; i++){
            leftPrefix[i] = leftPrefix[i-1] * nums[i-1];
        }

        int[] rightSuffix = new int[n];
        rightSuffix[n-1] = 1;

        for(int i = n - 2 ; i >= 0 ; i--){
            rightSuffix[i] = rightSuffix[i+1] * nums[i+1];
        }

        int[] productArray = new int[n];      
        for(int i = 0 ; i < n ; i++){
            productArray[i] = leftPrefix[i] * rightSuffix[i];
        }

        return productArray;
    }
}  
