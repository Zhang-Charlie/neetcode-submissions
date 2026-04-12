class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();

        for(int i = 0; i < s.length();i++){

            smap.put(s.charAt(i), getOrDefault(s.charAt(i), 0) + 1);
            tmap.put(t.charAt(i), getOrDefault(t.charAt(i), 0) + 1);

        }

        return smap.equals(tmap);
    }
}
