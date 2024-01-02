package ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=-1;
        for(int i:candies){
            if(i>max) max=i;
        } 
        List<Boolean> result = new ArrayList<>();
        for(int j: candies){
            result.add((j + extraCandies) >= max);
        }return result;
    }
}
