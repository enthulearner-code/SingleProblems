package leetcodeproblems2024.july;

import java.util.HashMap;
import java.util.Map;

/*
* You are given a 0-indexed integer array arr, and an m x n integer matrix mat. arr and mat both contain all the integers in the range [1, m * n].

Go through each index i in arr starting from index 0 and paint the cell in mat containing the integer arr[i].

Return the smallest index i at which either a row or a column will be completely painted in mat.



Example 1:

image explanation for example 1
Input: arr = [1,3,4,2], mat = [[1,4],[2,3]]
Output: 2
Explanation: The moves are shown in order, and both the first row and second column of the matrix become fully painted at arr[2].
Example 2:

image explanation for example 2
Input: arr = [2,8,7,4,1,3,5,6,9], mat = [[3,2,5],[1,4,6],[8,7,9]]
Output: 3
Explanation: The second column becomes fully painted at arr[3].


Constraints:

m == mat.length
n = mat[i].length
arr.length == m * n
1 <= m, n <= 105
1 <= m * n <= 105
1 <= arr[i], mat[r][c] <= m * n
All the integers of arr are unique.
All the integers of mat are unique.
* */
public class FirstPaintedRowColumn {
    private int firstCompleteIndex(int[] arr, int[][] mat) {
        int rows = mat.length;
        int columns = mat[0].length;
        Map<Integer,Integer> rowMap = new HashMap<>();
        Map<Integer,Integer> columnMap = new HashMap<>();
        boolean painted = false;
        for (int i=0; i< arr.length;i++){
            boolean found = false;
             for(int j=0;j<rows;j++){
                 for(int k=0;k<columns;k++){
                     if(mat[j][k] == arr[i]){
                         found = true;
                         rowMap.put(j,rowMap.getOrDefault(j,columns)-1);
                         columnMap.put(k,columnMap.getOrDefault(k,rows)-1);
                         if(rowMap.get(j) == 0 || columnMap.get(k)== 0){
                             painted = true;
                         }
                         break;
                     }
                 }
                 if(found || painted){
                     break;
                 }
             }
             if(painted)
                 return i;
        }
        return 0;
    }

    public static void main(String[] args){
        int[] arr = {1,4,5,2,6,3};
        int[][] mat = {{4,3,5},{1,2,6}};
        FirstPaintedRowColumn firstPaintedRowColumn = new FirstPaintedRowColumn();
        System.out.println(firstPaintedRowColumn.firstCompleteIndex(arr,mat));
    }
}
