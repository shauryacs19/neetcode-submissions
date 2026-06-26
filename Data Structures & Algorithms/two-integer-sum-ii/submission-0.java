class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        int running = 0;

        for(int i = 0 ; i < numbers.length ; i++){
            int complement = target - numbers[i];
            if(hash.containsKey(complement)){
                return new int[]{hash.get(complement) , i + 1};
            }
            hash.put(numbers[i] , i+1);
        }
        return new int[]{};
    }
}
