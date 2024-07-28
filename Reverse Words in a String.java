class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        
        String ans="";

        String[] words = s.split(" ");

        for (int i = words.length-1; i>=0 ; i--) {
            ans=ans + words[i]+" ";
        }

        return ans.substring(0,ans.length()-1);
    }
}


        
