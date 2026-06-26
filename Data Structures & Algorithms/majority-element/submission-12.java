class Solution { // Boyer Moore Majority Vote Algorithm
    public int majorityElement(int[] nums) {
        int current = nums[0];
        int count = 0;
        for(int num : nums){
            if(num == current){
                count++;
            }
            else{
                count--;
                if(count == 0){
                    current = num;
                    count++;
                }
            }
        }
        return current;
    }
}