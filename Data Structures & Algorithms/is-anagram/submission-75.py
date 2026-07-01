class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False


        countS, countT = {}, {}

        for i in range(len(s)):
            countS[i] = 1 + countS.get(s[i], 0)
            print(countS[i] )
            countT[i] = 1 + countT.get(t[i], 0)
            print(countT[i] )

        return countS == countT
        