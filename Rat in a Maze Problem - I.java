
class Solution {
    private List<String> ans = new ArrayList<>();

    private void solve(int i, int j, int end, String s, int[][] vis, int[][] mat) {
        // Base case
        if (i < 0 || j < 0 || i >= end || j >= end || vis[i][j] == 1 || mat[i][j] == 0) {
            return;
        }
        if (i == end - 1 && j == end - 1) {
            ans.add(s);
            return;
        }

        // Recursive case
        vis[i][j] = 1;
        solve(i + 1, j, end, s + "D", vis, mat);
        solve(i - 1, j, end, s + "U", vis, mat);
        solve(i, j + 1, end, s + "R", vis, mat);
        solve(i, j - 1, end, s + "L", vis, mat);
        vis[i][j] = 0;
    }

    public ArrayList<String> findPath(int[][] mat) {
        int end = mat.length;
        if (mat[0][0] == 0) {
            return new ArrayList<>(); // Return an empty list if the start cell is blocked
        }
        int[][] vis = new int[end][end];
        solve(0, 0, end, "", vis, mat);
        return new ArrayList<>(ans);
    }
}
