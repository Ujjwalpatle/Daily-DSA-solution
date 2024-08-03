class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans=new int[gain.length+1];
        ans[0]=0;
        int count=0;
        for(int i=0;i<gain.length;i++){
            ans[i+1]=ans[i]+gain[i];
            count=Math.max(count,ans[i+1]);
        }
        return count;
    }
}