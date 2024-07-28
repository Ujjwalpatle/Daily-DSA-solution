class Solution {
    public int[] moveZeroes(int[] nums) {
        int count=0;
        int len=nums.length-1;
        for(int i=0;i<=len;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        while(count<=len){
            nums[count++]=0;
        }
        
        return nums;
    }
}
