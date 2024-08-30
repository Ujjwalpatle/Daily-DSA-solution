import java.util.ArrayList;

class Solution {
    // Method to check if it's safe to place a queen at board[row][col]
    static boolean safe(int row, int col, int[][] cell) {
        int i, row0 = row, col0 = col;
        
        // Check upper left diagonal
        while (--row >= 0 && --col >= 0)
            if (cell[row][col] == 1) return false;
        
        row = row0; col = col0;
        
        // Check upper column
        while (--row >= 0)
            if (cell[row][col] == 1) return false;
        
        row = row0;
        
        // Check left row
        while (col-- > 0)
            if (cell[row][col] == 1) return false;
        
        return true; // It's safe to place the queen
    }
    
    // Helper method to place queens using backtracking
    static void helper(int idx, ArrayList<Integer> arl, ArrayList<ArrayList<Integer>> ans, int n, int[][] dp) {
        if (idx == n) {
            // If all queens are placed, add the solution to the answer list
            ans.add(new ArrayList<>(arl));
            return;
        }
        
        for (int i = 0; i < n; i++) {
            // Check if it's safe to place a queen at board[idx][i]
            if (safe(idx, i, dp)) {
                dp[idx][i] = 1; // Place the queen
                arl.add(i); // Add the position to the current solution
                
                // Recur to place the rest of the queens
                helper(idx + 1, arl, ans, n, dp);
                
                // Backtrack: remove the queen and try next position
                arl.remove(arl.size() - 1); 
                dp[idx][i] = 0;
            }
        }
    }
    
    // Main method to solve the N-Queens problem
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        int[][] dp = new int[n][n]; // Initialize the board
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); // List to store all solutions
        
        // Start placing queens from the first row
        helper(0, new ArrayList<>(), ans, n, dp);
        
        return ans; // Return all possible solutions
    }
}
