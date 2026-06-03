class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return len(s) > len(set(t))
        