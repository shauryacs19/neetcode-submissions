class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int mid = right - (left + right) / 2;
        return nums[mid];
    }
}