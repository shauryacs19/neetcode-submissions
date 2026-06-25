class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int absValue = 0;

        for(int i = 0 , j = 1 ; j < s.length() ; i++ , j++){
            int ascii1 = (int)s.charAt(i);
            int ascii2 = (int)s.charAt(j);
            absValue = Math.abs( ascii2 - ascii1);
            sum += absValue;
        }
        return sum;
    }
}