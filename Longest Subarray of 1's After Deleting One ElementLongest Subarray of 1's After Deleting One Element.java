class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        int zero=0;
        int l=1;
        for(int i=0;i<nums.length;++i){
            if(nums[i]==0){
                l--;
            }
            while(0>l){
                if(nums[zero]==0){
                    l++;
                }
                zero++;
            }
            count=Math.max(count,i-zero);
        }
        return count;
    }
}
