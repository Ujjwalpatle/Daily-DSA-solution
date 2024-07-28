class Solution{
    public boolean Palindrome(int x) {
        int rev=0;
        int y=x;
        while (y > 0){
            rev=(rev*10)+(y%10);
            y=y/10;
        }
        
        return x==rev;
    }


}
