class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        countT, countS = {}, {}

        for i in range(len(s)):
            countS[s[i]] = 1 + countS[i]
            countT[t[i]] = 1 + countS[i]
        return countS == countT

        
        