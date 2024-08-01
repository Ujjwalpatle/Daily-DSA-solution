import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int sr=0,er=matrix.length-1,sc=0,ec=matrix[0].length-1;
        int count=0;
        List<Integer> ans=new ArrayList<>(matrix.length*matrix[0].length);
        while(count<(matrix.length*matrix[0].length)){
            
            for(int i=sc;i<=ec&&count<(matrix.length*matrix[0].length);i++){
                ans.add(matrix[sr][i]);
                count++;
            }
            sr++;
            for(int i=sr;i<=er&&count<(matrix.length*matrix[0].length);i++){
                ans.add(matrix[i][ec]);
                count++;
            }
            ec--;
            for(int i=ec;i>=sc&&count<(matrix.length*matrix[0].length);i--){
                ans.add(matrix[er][i]);
                count++;
            }
            er--;
            for(int i=er;i>=sr&&count<(matrix.length*matrix[0].length);i--){
                ans.add(matrix[i][sc]);
                count++;
            }
            sc++;
        }
        return ans;
    }
}