class Solution {
    public int appendCharacters(String s, String t) {
        int indexS = 0;
        int minCharactertoFormSubstring = 0;

        for(int indexT = 0 ; indexT < t.length() ; indexT++){
            Character currentChar = t.charAt(indexT);
            
            while(indexS < s.length() && s.charAt(indexS) != currentChar){
                indexS++;
            }
            if(indexS == s.length()){
                return t.length() - indexT;
            }
            indexS++;
        }
        return 0;
    }
}