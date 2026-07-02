class Solution:
    def isPalindrome(self, s: str) -> bool:
        l = 0
        r = len(s) - 1
        print("1st Test:  l = ", l , " r = " ,  r)

        while l < r:
            while l < r and not s[l].isalnum():
                l += 1
            while l > r and not s[l].isalnum():
                r -= 1
            if s[l].lower() != s[r].lower():
                return False
                print("1st Test:  l = ", l , " r = " ,  r)

            l += 1
            r -= 1
        return True

        # while l < r:
        #         while l < r and not self.al
        