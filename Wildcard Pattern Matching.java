import java.util.Arrays;

class Solution {
    // Check Remaining Character are star or not
    static int stars (String p,int x) {
        for(int i=0;i<=x;i++){
            if(p.charAt(i)!='*') return 0;
        }
        return 1;
    }
    
    // DP function to check the pattern match
    static int check(int i,int j, String pattern, String str, int[][] dp){
        // base case
        if(i<0 && j<0) return 1;
        if(i<0 && j>=0) return 0;
        
        // if string ends before pattern and pattern contains only '*'
        if(i>=0 && j<0) return stars (pattern, i);
        
        // recursive case
        if(dp[i][j]!=-1) return dp[i][j];
        
        // if the current char of pattern and string matches or pattern char is '?'
        if(pattern.charAt(i)==str.charAt(j) || pattern.charAt(i)=='?')
            return check(i-1,j-1, pattern, str, dp);
        else{
            // check pattern for star
            if(pattern.charAt(i)=='*')
                // we call check function for both choices and take the maximum
                return dp[i][j]=Math.max(check(i,j-1, pattern, str, dp), check(i-1,j, pattern, str, dp));
            else return dp[i][j]=0;
        }
    }
    
    // Main function to check wildcard matching
    public int wildCard(String pattern, String str) {
        // Your code goes here
        int n=pattern.length(), m=str.length();
        int[][] dp=new int[n][m];
        // initialize the DP array with -1
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return check(n-1,m-1, pattern, str, dp);
    }
}