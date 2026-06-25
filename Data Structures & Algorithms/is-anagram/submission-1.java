class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character , Integer> hash1 = new HashMap<>();
        HashMap<Character , Integer> hash2 = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){

            if(hash1.containsKey(s.charAt(i))){
                int value = hash1.get(s.charAt(i));
                hash1.put(s.charAt(i) , ++value);
            }else{
                hash1.put(s.charAt(i) , 1);
            }

            if(hash2.containsKey(t.charAt(i))){
                int value = hash2.get(t.charAt(i));
                hash2.put(t.charAt(i) , ++value);
            }else{
                hash2.put(t.charAt(i) , 1);
            }
        }

        for (Character key : hash1.keySet()) {
            if(!hash1.get(key).equals(hash2.get(key))){
                return false;
            }
        }
        return true;

    }
}
