
import java.util.Arrays;

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum=0;

        for(int i=0;i<seats.length;i++){
            int diff=Math.abs(seats[i]-students[i]);
            sum += diff;
        }

        return sum;
        
    }
}
