class Solution {
    public String findOrder(String[] dict, int n, int k) {
        // Write your code here
        
        // Step 1: Create an adjacency list for the graph
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<k;i++){
            adj.add(new ArrayList<>());
        }
        
        
        // Step 2: Build the graph by comparing adjacent words
        
        for(int i=0;i<n-1;i++){
            String s1=dict[i];
            String s2=dict[i+1];
            int len=Math.min(s1.length(),s2.length());
            for(int j=0;j<len;j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    adj.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                    break;
                }
            }
        }
        
        
        
        //Topological sort
        
        int[] deg=new int[k];
        for(int i=0;i<k;i++){
            for(int x:adj.get(i)){
                deg[x]++;
            }
        }
        
        Queue<Integer> q=new LinkedList<>();
        StringBuilder str=new StringBuilder();
        
        for(int i=0;i<k;i++){
            if(deg[i]==0){
                q.offer(i);
            }
        }
        
        
        
        // BFS (Kahn's Algorithm)
        
        while(!q.isEmpty()){
            int u=q.poll();
            str.append((char) (u+'a'));
            
            for(int x:adj.get(u)){
                deg[x]--;
                if(deg[x]==0){
                    q.offer(x);
                }
            }
            
        }
        
        if(str.length()==k){
            return str.toString();
        }
        
        return "";
        
    }
}