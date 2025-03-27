package dailyproblems;

import java.util.ArrayList;
import java.util.List;

public class SpecialArray {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int arrLength = nums.length;
        int queryLength = queries.length;
        int[] sumArray = new int[arrLength];
        boolean[] resultArray = new boolean[queryLength];
        sumArray[0]=1;
        for(int i=1;i<arrLength-1;i++){
            sumArray[i] = sumArray[i-1];
            if(nums[i]%2 != nums[i+1]%2)
                sumArray[i]++;
        }
        for(int i=0;i<queryLength;i++){
            boolean result = false;
            int start = queries[i][0], end = queries[i][1];
            if(start==end)
                result = true;
            int querysize = end - start;
            int splArrLength = sumArray[end] - sumArray[start];
            if(querysize == splArrLength)
                result = true;
            resultArray[i]= result;
        }
        return resultArray;
    }
}
