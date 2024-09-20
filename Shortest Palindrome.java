class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        String str = s + "*" + new StringBuilder(s).reverse().toString();

        int[] kmp = new int[str.length()];
        for (int i = 1; i < kmp.length; i++) {
            int pos = kmp[i - 1];
            while (pos > 0 && str.charAt(pos) != str.charAt(i)) {
                pos = kmp[pos - 1];
            }
            kmp[i] = pos + ((str.charAt(pos) == str.charAt(i)) ? 1 : 0);
        }

        return new StringBuilder(s.substring(kmp[kmp.length - 1])).reverse().toString() + s;
    }
}