package dailyproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OperationToArray {
    public int[] applyOperations(int[] nums) {
        int n=nums.length,c=0,i;
        int r[]=new int[n];
        for(i=0;i<n-1;i++){
            if(nums[i]!=0){
                if(nums[i]==nums[i+1]){
                    r[c++]=nums[i]*2;i++;
                }else{
                    r[c++]=nums[i];
                }
            }}
        if(i!=n){
            r[c]=nums[n-1];
        }
        return r;
    }
    public static void main(String[] args){
        OperationToArray operationToArray = new OperationToArray();
        int[] inputArray= {1,0,2,2,0,1,3,0};
        int[] outputArray = operationToArray.applyOperations(inputArray);
        Arrays.stream(outputArray).forEach( a-> System.out.println(a));
    }
}
