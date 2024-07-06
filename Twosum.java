class Twosum {

    static int[] twosum(int nums[],int target){
        for(int i=0;i<=nums.length;i++){
            for(int j=1;j<=nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
                
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,6};
        int target=5;
        twosum(arr,target);
    }
    
    
    
}
