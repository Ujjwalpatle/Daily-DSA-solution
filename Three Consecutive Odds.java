class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int a=arr.length;
        int count=0;

        for(int i=0;i<a;i++){
            if(arr[i]%2!=0){
                count++;
                if(count==3){
                    break;
                }
                else{
                    continue;
                }
            }
            else{
                count=0;
            }
        }
        if(count==3){
            return true;
        }
        else{
            return false;
        }
        
    }

    private static class ListNode {

        public ListNode() {
        }
    }
}
