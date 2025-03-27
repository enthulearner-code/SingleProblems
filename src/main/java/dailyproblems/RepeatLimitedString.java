package dailyproblems;

import java.util.*;

public class RepeatLimitedString {
    Map<Character, Integer> charCountMap = new TreeMap<>(Comparator.reverseOrder());
    public String repeatLimitedString(String s, int repeatLimit) {
        char[] charArray = s.toCharArray();
        populateCharCountMap(charArray);
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Character> keyList = charCountMap.keySet().iterator();
        while(keyList.hasNext()){
            Character character = keyList.next();
            if(charCountMap.get(character) < repeatLimit){
                stringBuilder.append(character.toString().repeat(repeatLimit));
                keyList.remove();
            }
            else{

            }
        }
        return "";
    }

    private void populateCharCountMap(char[] charArray){
        int charCount;
        for(int i=0;i<charArray.length;i++){
            char c = charArray[i];
            charCount = charCountMap.getOrDefault(c,0);
            charCount++;
            charCountMap.put(c,charCount);
        }
    }

    public static void main(String[] args){
        RepeatLimitedString repeatLimitedString = new RepeatLimitedString();
        repeatLimitedString.repeatLimitedString("aabbcddd",2);
    }
}
