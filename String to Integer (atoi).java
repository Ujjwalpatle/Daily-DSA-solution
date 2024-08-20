class Solution {
    public int myAtoi(String s) {
        int len=s.length();
        int index=0,sign=1,total=0;

        if(len==0) return 0;

        while(s.charAt(index) == ' ' && index < s.length()){
            index++;
            if(index==len) return 0;
        }

        if(s.charAt(index)=='+'||s.charAt(index)=='-'){
            if(s.charAt(index)=='+') sign*=1;
            else sign*=-1;
            index++;
        }

        while(index<len){
            int digit = s.charAt(index)-'0';
            if(digit<0 || digit>9) break;

            if(Integer.MAX_VALUE/10 < total ||Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE%10 < digit) return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            total=10*total+digit;
            index++;
        }
        return total*sign;
    }
}