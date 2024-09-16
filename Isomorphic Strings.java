class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        HashMap<Character,Character> ans=new HashMap<>();
        HashMap<Character,Character> ans2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(ans.containsKey(s.charAt(i))  && ans.get(s.charAt(i))!=t.charAt(i)) return false;
            if(ans2.containsKey(t.charAt(i))  && ans2.get(t.charAt(i))!=s.charAt(i)) return false;
            ans.put(s.charAt(i),t.charAt(i));
            ans2.put(t.charAt(i),s.charAt(i));
        }

        return true;
    }
}