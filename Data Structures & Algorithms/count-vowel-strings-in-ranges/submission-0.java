class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixSum = new int[n];

        for (int i = 0; i < n; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);

            int isVowelString = (isVowel(first) && isVowel(last)) ? 1 : 0;

            if (i == 0) {
                prefixSum[i] = isVowelString;
            } else {
                prefixSum[i] = prefixSum[i - 1] + isVowelString;
            }
        }

        int[] result = new int[queries.length]; 
        int queryIndex = 0;
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];

            if (left == 0) {
                result[queryIndex] = prefixSum[right];
            } else {
                result[queryIndex] = prefixSum[right] - prefixSum[left - 1];
            }

            queryIndex++;
        }
        return result;
    }

    public static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' ||
           c == 'o' || c == 'u';
    }
}