class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        int cel=0;
        for(int i=0;i<mat.length;i++){
            if(mat[cel][i]==1) cel=i;
        }
        
        for(int i=0;i<mat.length;i++){
            if(i!=cel &&(mat[cel][i]==1 || mat[i][cel]==0)) return -1;
        }
        
        return cel;
    }
}