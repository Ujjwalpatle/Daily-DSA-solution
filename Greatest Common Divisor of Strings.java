class Solution {

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public String gcdOfStrings(String str1, String str2) {
        String add1=str1+str2;
        String add2=str2+str1;

        if(!add1.equals(add2)){
            return "";
        }
        int gcd=gcd(str1.length(), str2.length());
        return str1.substring(0,gcd);
    }
}
