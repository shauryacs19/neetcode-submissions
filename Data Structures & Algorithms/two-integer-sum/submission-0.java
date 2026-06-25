class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        hash.put(nums[0] , 0);
        for(int i = 1 ; i < nums.length ; i++){
            int difference = target - nums[i];
            if(hash.containsKey(difference)){
                return new int[]{ hash.get(difference), i};
            }
            hash.put(nums[i] , i);
        }
        return new int[]{};
    }
}
