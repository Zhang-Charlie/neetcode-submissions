class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newSt = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newSt.append(Character.toLowerCase(c));
            }
        }
        return newSt.toString().equals(newSt.reverse().toString());
    
    }
}
