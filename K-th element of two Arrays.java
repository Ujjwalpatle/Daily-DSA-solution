class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        int n=arr1.length;
        int m=arr2.length;
        
        if(k==n+m) return Math.max(arr1[n-1],arr2[m-1]);
        if(k==1) return Math.min(arr1[0],arr2[0]);
        
        int i=0,j=0;
        while(i<n && j<m && k>1){
            if(arr1[i]<=arr2[j]) i++;
            else j++;
            k--;
        }
        
        while(i<n && k>1){
            i++;
            k--;
        }
        while(j<m && k>1){
            j++;
            k--;
        }
        
        if(i==n) return arr2[j];
        else if(j==m) return arr1[i];
        return Math.min(arr1[i],arr2[j]);
        
    }
}