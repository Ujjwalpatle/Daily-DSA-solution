class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int len=len1+len2;
        char[] ans=new char[len1+len2];
        int sum1=0,sum2=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++){
            if(len1>len2){
                if(i%2==0 && sum1<len2){
                    sb.append(word1.charAt(sum1));
                    sum1++;
                }
                else if(i%2!=0 && sum2<len2){
                    sb.append(word2.charAt(sum2));
                    sum2++;
                }
                else{
                    sb.append(word1.charAt(sum1));
                    sum1++;
                }
            }
            else if(len1<len2){
                if(i%2==0 && sum1<len1){
                    sb.append(word1.charAt(sum1));
                    sum1++;
                }
                else if(i%2!=0 && sum2<len1){
                    sb.append(word2.charAt(sum2));
                    sum2++;
                }
                else{
                    sb.append(word2.charAt(sum2));
                    sum2++;
                }
            }
            else{
                if(i%2==0 && sum1<len1){
                    sb.append(word1.charAt(sum1));
                    sum1++;
                }
                else if(i%2!=0 && sum2<len1){
                    sb.append(word2.charAt(sum2));
                    sum2++;
                }
            }
            
            

        }
        return sb.toString();

    }
}
