class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String , List<String>> hash = new HashMap<>();

        for(int i = 0 ; i < strs.length ; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            if(!hash.containsKey(key)){
                hash.put(key , new ArrayList<>());
            }
            hash.get(key).add(strs[i]);

        }
        return new ArrayList<>(hash.values());
    }
}
