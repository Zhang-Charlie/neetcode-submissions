class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> end  = new HashMap<>();
        for (String s : strs){
            int[] count = new int[26];
            for (char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            end.putIfAbsent(key, new ArrayList<>());
            end.get(key).add(s);
        }
        return new ArrayList<>(end.values());
    }
}

// Change them into chars one by one when going through them

// Check first -> second and iterate thorugh all
// compare first with second then all
// check if they have same characters in it 
// group it if it does and recursion the group
// T: O(N^2) 
// S:O(1)

// HashMap 
// #1
// Map all values 
// Check if the other ones has the same chars
// group if they do
// Print Original
// T & S: O(n)

// #2
// Map all values 
// Check prev ones if they have the same chars
// group them together
// Print Original
// T & S : O(n)