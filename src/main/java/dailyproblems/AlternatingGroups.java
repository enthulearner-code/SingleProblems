package dailyproblems;

/*
There is a circle of red and blue tiles. You are given an array of integers colors and an integer k. The color of tile i is represented by colors[i]:

colors[i] == 0 means that tile i is red.
colors[i] == 1 means that tile i is blue.
An alternating group is every k contiguous tiles in the circle with alternating colors (each tile in the group except the first and last one has a different color from its left and right tiles).

Return the number of alternating groups.

Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.
Example 1:

Input: colors = [0,1,0,1,0], k = 3

Output: 3

Explanation:



Alternating groups:



Example 2:

Input: colors = [0,1,0,0,1,0,1], k = 6

Output: 2

Explanation:



Alternating groups:



Example 3:

Input: colors = [1,1,0,1], k = 4

Output: 0

Explanation:





Constraints:

3 <= colors.length <= 105
0 <= colors[i] <= 1
3 <= k <= colors.length
 */

import java.util.ArrayList;
import java.util.List;

public class AlternatingGroups {

    public int numberOfAlternatingGroups(int[] colors,int k){
        int length = colors.length;
        int count =0;
        for(int i=0,j=i+1;i< length+k+1;i++,j++){
                if(colors[i%length] == colors[(j)%length]){
                    i=j;
                }
                if(j-i >= k) {
                    count++;
                }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] testArray = {0, 1, 0, 0};
        AlternatingGroups alternatingGroups = new AlternatingGroups();
        int result = alternatingGroups.numberOfAlternatingGroups(testArray, 3);
        System.out.println(result);
    }
}
