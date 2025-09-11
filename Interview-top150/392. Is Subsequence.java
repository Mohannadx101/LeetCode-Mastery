// 22 / 22 test cases passed.
// Status: Accepted
// Runtime: 1 ms
// Memory Usage: 41.4 MB
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length(), tLen = t.length();
        if (sLen == 0) return true;
        if (tLen == 0) return false;

        int sIndex = 0, tIndex = 0;
        while (tIndex < tLen) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
                if (sIndex == sLen) return true;
            }
            tIndex++;
        }
        return false;
    }
}
