class Solution {
    public boolean isPalindrome(String s) {

        // Example input to trace:
        // s = "A man, a plan, a canal: Panama"

        StringBuilder newStr = new StringBuilder(); // will store only lowercase letters/digits

        // s.toCharArray() turns the string into a char[] so we can loop each character
        // For our example, characters include: 'A',' ','m','a','n',',',' ', ... , 'a'
        for (char c : s.toCharArray()) {

            // Keep only letters and digits, skip spaces and punctuation
            // Example: 'A' -> true, ' ' -> false, ',' -> false, ':' -> false
            if (Character.isLetterOrDigit(c)) {

                // Convert to lowercase then append to newStr
                // 'A' -> 'a', 'm' -> 'm', 'P' -> 'p', '0' -> '0'
                newStr.append(Character.toLowerCase(c));

                // Trace snapshots of newStr as we build it:
                // after 'A'    -> "a"
                // after 'm'    -> "am"
                // after 'a'    -> "ama"
                // after 'n'    -> "aman"
                // after next 'a' -> "amana"
                // ...
                // final newStr -> "amanaplanacanalpanama"
            }
        }

        // At this point:
        // newStr (forward) = "amanaplanacanalpanama"

        // Convert builder to a String for the forward version
        String forward = newStr.toString();
        // forward = "amanaplanacanalpanama"

        // Reverse the StringBuilder in place
        newStr.reverse();
        // newStr (reversed builder) = "amanaplanacanalpanama" (same here because it is a palindrome)

        // Convert reversed builder to a String
        String backward = newStr.toString();
        // backward = "amanaplanacanalpanama"

        // Compare forward and backward strings
        // If identical -> palindrome
        return forward.equals(backward);
    }
}
