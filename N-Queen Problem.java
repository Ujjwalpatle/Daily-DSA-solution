
import java.util.ArrayList;

class Solution {
        static boolean safe(int row, int col, int[][]dp){
            int cr=row,cl=col;
            while(cl>=0) if (dp[cr] [cl--]==1) return false;
            cr=row;
            cl=col;
            while(cl>=0 && cr>=0) if (dp[cr] [cl--]==1) return false;
            cr=row;
            cl=col;
            while(cl>=0 && cr<dp.length) if(dp[cr++] [cl--]==1) return false;
            return true;
        }
        static void helper(int idx, ArrayList<Integer> arrl, ArrayList<ArrayList<Integer>> ans, int n,int[][] dp){
            if(idx==n)
                ans.add(new ArrayList<>(arrl));
            for(int i=0;i<n;i++){
                if(safe(i, idx, dp)) {
                    dp[i][idx]=1;
                    arrl.add(i+1);
                    helper(idx+1, arrl, ans, n, dp);
                    dp[i][idx]=0;
                }
            }
            arrl.remove(arrl.size()-1);
        }
        public ArrayList<ArrayList<Integer>> nQueen(int n) {
            ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
            int[][] dp=new int[n][n];
            helper (0, new ArrayList<>(), ans, n, dp);
            return ans;
        }
    }
