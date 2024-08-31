
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<Integer> find3Numbers (int[] arr) {
    // code here
        int[] small=new int[arr.length];
        int[] big=new int[arr.length];
        small[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            small[i]=Math.min(small[i-1],arr[i]);
        }
    
        big[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            big[i]=Math.max(big[i+1],arr[i]);
        }

    
        for(int i=0;i<arr.length;i++){
            if(small[i]<arr[i] && arr[i] <big[i]) return Arrays.asList(small[i], arr[i], big [i]);
        }
        return Arrays.asList();
    }
}