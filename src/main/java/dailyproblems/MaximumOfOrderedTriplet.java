package dailyproblems;

public class MaximumOfOrderedTriplet {
    public long maximumTripletValue(int[] nums) {
        int length = nums.length;
        long firstMax = 0,subMax=0, result =0;
        for(int i=0;i<length;i++){
            result = Math.max(result,subMax * nums[i]);
            subMax = Math.max(subMax,firstMax-nums[i]);
            firstMax = Math.max(firstMax,nums[i]);
        }
        return result;
    }

    public static void main(String[] args){
        MaximumOfOrderedTriplet maximumOfOrderedTriplet = new MaximumOfOrderedTriplet();
        int[] testArray ={1000000,1,1000000};
        long result = maximumOfOrderedTriplet.maximumTripletValue(testArray);
        System.out.println(result);
    }
}
