
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> list = new ArrayList<>();

        if(candies.length==0){
            return list;
        }
        
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
