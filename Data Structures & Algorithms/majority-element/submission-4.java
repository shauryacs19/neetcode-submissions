class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        return nums[mid];
    }
}