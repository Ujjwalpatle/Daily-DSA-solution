class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                ans[count++]=nums[i];
            }
        }
        ans[count++]=nums[n-1];

        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
        return count;
    }
}

