class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        smap, tmap = {}, {}

        for i in range(len(s)):
            smap[i] = 1 + smap(s[i], 0)
            tmap[i] = 1 + tmap.add(t[i], 0)

            return smap == tmap