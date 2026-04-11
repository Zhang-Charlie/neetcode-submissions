class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            
            HashMap<Character, Integer> map = new HashMap<>();
            int maxf = 0;
            for(int j = i; j < s.length();j++){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                maxf = Math.max(maxf, map.get(s.charAt(j)));

                if((j - i + 1) - maxf <= k){
                    ans = Math.max(ans, j - i + 1);
                }
            }
            
        }
        return ans;
    }
}
