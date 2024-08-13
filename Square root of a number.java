class Solution {
    long floorSqrt(long n) {
        // Use Two Pointer Approach
        long temp = 1;
        long end = n;
        long ans = 0;
        
        while(end >= temp){
            if(temp * temp <= n){
                ans = temp;
                temp++;
            }else{
                end--;
            }
        }
        return ans;
    }
}



//alternate solution

// class Solution {
//     long floorSqrt(long n) {
//         int m=(int) Math.sqrt(n);
//         return m;
//     }
// }