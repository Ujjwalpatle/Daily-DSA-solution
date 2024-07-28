class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len=nums.length-1;
        int start=-1;
        int end=-1;
        int low=0;
        while(low<=len){
            int mid=low+(len-low)/2;
            if (nums[mid] == target){
                start = mid;
                len = mid - 1;
            }
            else if (nums[mid] < target){
                low = mid + 1;
            }
            else{
                len = mid - 1;
            }
            
        }

        
        low=0;
        len=nums.length-1;
        
        while(low<=len){
            int mid=low+(len-low)/2;
            if (nums[mid] == target){
                end = mid;
                low = mid + 1;
            }
            else if (nums[mid] < target){
                low = mid + 1;
            }
            else{
                len = mid - 1;
            }
            
        }



        int[] ans={start,end};
        return ans;

        
    }
}
