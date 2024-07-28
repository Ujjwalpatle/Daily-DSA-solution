class Solution {
    public int reverse(int x) {
        int rev=0;
        int result=0;
        while(x!=0){
            rev=(rev*10)+(x%10);
            
            if((rev-x%10)/10 !=result){
                return 0;
            }
            result=rev;
            x=x/10;
        }
        return result;
    }
}
