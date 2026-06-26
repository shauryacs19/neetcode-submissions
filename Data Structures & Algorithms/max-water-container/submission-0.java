class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxVolume = 0;
        while(left < right){
            int height = Math.min(heights[left] , heights[right]);
            int width = right - left;
            int currVolume =  height * width;

            if(currVolume > maxVolume) maxVolume = currVolume;
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxVolume;
    }
}
