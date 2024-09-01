
class Solution {

    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        int len = s.length();
        StringBuilder ans = new StringBuilder("");
        int cycle = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < len; j += cycle) {
                ans.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycle - i < len) {
                    ans.append(s.charAt(j + cycle - i));
                }
            }
        }

        return ans.toString();
    }
}
