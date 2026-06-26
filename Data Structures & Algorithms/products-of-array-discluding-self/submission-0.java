class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        for(int num : nums){
            totalProduct *= num;
        }

        int[] productArray = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                int tempProduct = 1;
                
                for(int x = 0 ; x < nums.length ; x++){
                    if(x == i) continue;
                    tempProduct *= nums[x];
                }
                productArray[i] = tempProduct;
                continue;
            }
            productArray[i] = totalProduct / nums[i];
        }
        return productArray;
    }
}  
