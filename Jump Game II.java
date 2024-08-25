class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int jumps=0,start=0,end=0;
        for(int i=0;i<n;i++){
            start=Math.max(start,i+nums[i]);
            if(i==end){
                jumps++;
                end=start;
            }
        }
        return jumps;
    }
}