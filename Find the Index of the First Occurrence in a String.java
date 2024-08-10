class Solution {
    public int strStr(String haystack, String needle) {
        int len1=haystack.length();
        int len2=needle.length();
        if(len1<len2) return -1;
        if(len1==len2 && haystack.equals(needle)) return 0;
        
        int temp=-1,i;
        for(i=0;i<len1-len2;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                temp=i;
                if(needle.equals(haystack.substring(temp,temp+len2))) return temp;
            }
            temp=-1;
        }
        if(needle.equals(haystack.substring(i,len1))) return i;


        return temp;
    }
}