class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int max=Integer.MIN_VALUE;
        int min=0;
        for(int i=0;i<arr.length;i++){
            min+=arr[i];
            if(max<min){
                max=min;
            }
            if(min<0){
                min=0;
            }
        }
        return max;
    }
}