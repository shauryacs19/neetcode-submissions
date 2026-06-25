class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(hash.keySet());
        keys.sort((a, b) -> hash.get(b) - hash.get(a));
        
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }

        return result;
    }
}