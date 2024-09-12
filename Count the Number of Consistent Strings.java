class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> pre=new HashSet<>();

        for(int i=0;i<allowed.length();i++){
            if(!pre.contains(allowed.charAt(i))){
                pre.add(allowed.charAt(i));
            }
        }

        int count=0;
        for(int i=0;i<words.length;i++){
            Boolean safe=true;
            String curr=words[i];
            for(int j=0;j<curr.length();j++){
                if(!pre.contains(curr.charAt(j))){
                    safe=false;
                    break;
                }
            }

            if(safe){
                count++;
            }
        }
        return count;
    }
}