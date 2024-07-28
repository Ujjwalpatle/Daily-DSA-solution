class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int width=right-left;
            int newarea=Math.min(height[left],height[right])*width;
            area=Math.max(area,newarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
        
    }
}
