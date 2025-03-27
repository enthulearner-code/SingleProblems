package dailyproblems;

import java.util.*;

public class MultiplicationArrays {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<int[]> indexQueue = new PriorityQueue<>((a,b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        for(int i=0;i<nums.length;i++){
            indexQueue.add(new int[]{nums[i],i});
        }
        for(int i=0;i<k;i++){
            int[] indValue = indexQueue.poll();
            indValue[0] *= multiplier;
            indexQueue.add(indValue);
        }
        indexQueue.stream().forEach(ints -> {
            nums[ints[1]] = ints[0];
        });
        return nums;
    }

    public static void main(String[] args){
        MultiplicationArrays multiplicationArrays = new MultiplicationArrays();
        int[] intArray = {2,1,5,3,6};
        int[] result = multiplicationArrays.getFinalState(intArray,5,2);
    }
}
