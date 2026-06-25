class Solution {
    public int[] getConcatenation(int[] nums) {
        int Numslength = nums.length;
        int[] ans = new int[2*Numslength];
        
        int i = 0;
        while(i < ans.length){
            if(i < Numslength){
                ans[i] = nums[i];
            }else{
                ans[i] = nums[i - Numslength];
            }
            i++;
        }
        return ans;
    }
}