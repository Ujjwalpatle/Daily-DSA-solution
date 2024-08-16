class Solution
{
    
    static int maxcut(int n,int x,int y,int z,ArrayList<Integer> dp){
        if(n<0) return Integer.MIN_VALUE;
        if(n==0) return 0;
        else if (dp.get(n) != 0) return dp.get(n);
        
        int cutx=maxcut(n-x,x,y,z,dp);
        int cuty=maxcut(n-y,x,y,z,dp);
        int cutz=maxcut(n-z,x,y,z,dp);
        dp.set(n,1+Math.max(cutx, Math.max(cuty, cutz)));
        return dp.get(n);
        
    }
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
        
        ArrayList<Integer> dp = new ArrayList<>(Collections.nCopies(n + 1, 0));
        if(maxcut(n,x,y,z,dp)<0) return 0;
        return maxcut(n,x,y,z,dp);
    }
}
