
class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        int ans=0;
        int row=0;
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            
            if(ans<count && count!=0){
                ans=count;
                row=i;
            }
        }
        
        if(ans!=0){
            return row;
        }
        return -1;
    }
}