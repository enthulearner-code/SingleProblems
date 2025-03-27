package dailyproblems;
/*
Given two positive integers left and right, find the two integers num1 and num2 such that:

left <= num1 < num2 <= right .
Both num1 and num2 are prime numbers.
num2 - num1 is the minimum amongst all other pairs satisfying the above conditions.
Return the positive integer array ans = [num1, num2]. If there are multiple pairs satisfying these conditions, return the one with the smallest num1 value. If no such numbers exist, return [-1, -1].



Example 1:

Input: left = 10, right = 19
Output: [11,13]
Explanation: The prime numbers between 10 and 19 are 11, 13, 17, and 19.
The closest gap between any pair is 2, which can be achieved by [11,13] or [17,19].
Since 11 is smaller than 17, we return the first pair.
Example 2:

Input: left = 4, right = 6
Output: [-1,-1]
Explanation: There exists only one prime number in the given range, so the conditions cannot be satisfied.


Constraints:

1 <= left <= right <= 106
 */

import java.util.ArrayList;
import java.util.List;

public class ClosesPrimeNumbers {
    List<Integer> primeArray = new ArrayList<>();
    int[] resultArray = {-1,-1};
    int minDiff = -1;
    public int[] closestPrimes(int left, int right) {
        while(left <= right){
            boolean primeFlag =checkForPrimeNumber(left);
            if(primeFlag){
                primeArray.add(left);
            }
            left++;
        }
        if(primeArray.size() < 2)
            return resultArray;
        for(int i=0; i< primeArray.size()-1;i++) {
            calculateAndAssignResultArray(primeArray.get(i),primeArray.get(i+1));
        }
        return resultArray;
    }
    private void calculateAndAssignResultArray(int num1, int num2){
        if(minDiff == -1 || (num2-num1) < minDiff){
            minDiff = num2 - num1;
            resultArray[0] = num1;
            resultArray[1] = num2;
        }
    }
    private boolean checkForPrimeNumber(int num){
        if(num < 2)
            return false;
        for(int i=2 ; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        ClosesPrimeNumbers closesPrimeNumbers = new ClosesPrimeNumbers();
        int[] resArray = closesPrimeNumbers.closestPrimes(19,31);
        System.out.println("Complete");
    }
}
