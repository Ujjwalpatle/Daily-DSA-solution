class Solution {
    public String reverseVowels(String s) {
        String vol="aeiouAEIOU";
        char[] chars=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while(start<end && !vol.contains(chars[start]+"")){
                start++;
            }

            while(start<end && !vol.contains(chars[end]+"")){
                end--;
            }

            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }

        return new String(chars);
    }
}
