class Solution {
    public int distinctSubseqII(String s) {

        int MOD = 1000000007;

        int[] last = new int[26];

        int dp = 0;

        for (char c : s.toCharArray()) {

            int newDp = (2 * dp + 1 - last[c - 'a']) % MOD;

            if (newDp < 0) {
                newDp += MOD;
            }

            last[c - 'a'] = dp + 1;

            dp = newDp;
        }

        return dp;
    }
}