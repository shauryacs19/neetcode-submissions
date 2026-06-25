class Solution {
    public int lengthOfLastWord(String s) {
        int pointerIndex = s.length() - 1;

        while (pointerIndex >= 0 && s.charAt(pointerIndex) == ' ') {
            pointerIndex--;
        }

        int count = 0;

        while (pointerIndex >= 0 && s.charAt(pointerIndex) != ' ') {
            count++;
            pointerIndex--;
        }

        return count;
    }
}