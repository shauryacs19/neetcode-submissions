class Solution {
    public int maxScore(String s) {
        int rightOnes = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '1'){
                rightOnes++;
            }
        }

        int maxLength = 0;
        int leftZeroes = 0;
        for(int i = 0 ; i < s.length() - 1 ; i++){
            if(s.charAt(i) == '0'){
                leftZeroes++;
            }else{
                rightOnes--;
            }
            int score = leftZeroes + rightOnes;
            maxLength = Math.max(maxLength , score);
        }
        return maxLength;
    }
}