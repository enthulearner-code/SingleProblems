package dailyproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOfSubString {
    public long countOfSubstrings(String word, int k) {
        List<Integer> consonantIndexes = new ArrayList<>();
        Map<Character,Integer> vowelMap = new HashMap<>();
        long result =0;
        int left =0, right=0,count=1;
        int vowelsBeforeCons = 0;
        if(word.length() < k+5)
            return result;
        for(int i=0;i<word.length();i++){
            if(!isVowel(word.charAt(i)))
                consonantIndexes.add(i);
        }
        right = consonantIndexes.get(k)-1;
        while(left <= right){
            char currentChar = word.charAt(left);
            if(isVowel(currentChar))
                vowelMap.put(currentChar,vowelMap.getOrDefault(currentChar,0)+1);
            if(vowelMap.size() == 5){

            }
        }
        return result;
    }

    private boolean isVowel(char c){
        return c == 'a' || c== 'e' || c=='i'||c=='o'||c=='u';
    }

    public static void main(String[] args){
        CountOfSubString countOfSubString = new CountOfSubString();
        String testString ="iqeaouqi";
        long result =countOfSubString.countOfSubstrings(testString,1);
        System.out.println(result);
    }
}
