class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        int indexT = 0;

        for(int indexS = 0 ; indexS < s.length() ; indexS++){
            Character currentChar = s.charAt(indexS);
            
            while(indexT < t.length() && t.charAt(indexT) != currentChar){
                indexT++;
            }

            if(indexT == t.length()){
                return false;
            }

            indexT++;
        }
        return true;
    }
}