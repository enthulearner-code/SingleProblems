package leetcodeproblems2024.june;

import java.lang.reflect.Array;
import java.util.*;

public class LexographicString {
    public String clearStars(String s) {
        if(s == null || s.isEmpty() ||!s.contains("*"))
            return s;
        char[] charArray = s.toCharArray();
        List<Integer> indexOfAsterix = new ArrayList<>();
        for(int i=0;i<charArray.length;i++){
            if(charArray[i] == '*'){
                indexOfAsterix.add(i);
                charArray[i]='';
            }
        }
        char[] sortedArray = charArray;
        Arrays.sort(sortedArray);
        Map<Character,List<Integer>> indexOfCharacters = new HashMap<>();
        for(int i=0;i<charArray.length;i++){
            char character = charArray[i];
            List<Integer> index;
            if(indexOfCharacters.get(character) != null)
                index = indexOfCharacters.get(character);
            else
                index = new ArrayList<>();
            index.add(i);
            indexOfCharacters.put(character,index);
        }

        for(int i=0;i<indexOfAsterix.size();i++){
            int maxIndex = indexOfAsterix.get(i);
            

        }
    }
    public static void main(String[] args){
        DaysWithoutMeeting daysWithoutMeeting = new DaysWithoutMeeting();
        System.out.println(daysWithoutMeeting.countDays(10,new int[][]{{5,7},{1,3},{9,10}}));
    }
}
