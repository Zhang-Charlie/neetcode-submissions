class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] s = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            s[s.charAt(i) - 'a']++;
            s[t.charAt(i) - 'a']--;
        }
        for(int n : s) if(n != 0) return false;
        
        return true;
    }
}
