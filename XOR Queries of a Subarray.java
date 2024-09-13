class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int[] ans=new int[arr.length];
        ans[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ans[i]=ans[i-1]^arr[i];
        }

        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int k=queries[i][0];
            int j=queries[i][1];
            if(k==0){
                res[i]=ans[j];
            }else{
                res[i]=ans[j]^ans[k-1];
            }
        }
        return res;

    }
}