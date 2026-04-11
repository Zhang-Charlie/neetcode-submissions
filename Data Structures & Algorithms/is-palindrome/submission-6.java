class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }

        String forward = newStr.toString();
        String backwards = newStr.reverse().toString();
    
        return newStr.toString().equals(newStr.reverse().toString());
    }
}
