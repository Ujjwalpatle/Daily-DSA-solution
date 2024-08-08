class Solution {
    public boolean isAnagram(String s, String t) {
        char temp[] = s.toCharArray();
        char temp2[] = t.toCharArray();
        Arrays.sort(temp);
        Arrays.sort(temp2);
        int count=0;
        if(s.length()!=t.length()){
            return false;
        }
        else{
            for(int i=0;i<s.length();i++){
                if(temp[i]==temp2[i]){
                    count++;
                }
            }
        }

        if(count==s.length()){
            return true;
        }
        return false;

    }
}
