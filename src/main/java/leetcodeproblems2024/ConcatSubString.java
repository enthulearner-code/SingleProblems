package leetcodeproblems2024;

import java.util.*;

public class ConcatSubString {


    private List<Integer> findSubstring(String s, String[] words){
        List<Integer> indexesOfSubString = new ArrayList<>();
        if(s.length() == 0 || words.length == 0){
            return indexesOfSubString;
        }
        int minimumIndex,startPos=0;
        int substrLength= words[0].length();
        int wordsCount = words.length;
        if(words.length == 1){
            if(s.indexOf(words[0]) != -1) {
                int index = s.indexOf(words[0]);
                indexesOfSubString.add(index);
                while(s.indexOf(words[0],index)!= -1){
                    index = s.indexOf(words[0],index);
                    indexesOfSubString.add(index);
                }
            }
            return indexesOfSubString;
        }
        else{
            minimumIndex = getIndexesOfSubString(s,words,startPos);
            if(minimumIndex == s.length()){
                return indexesOfSubString;
            }else{
                int tempIndex = minimumIndex;
                int counter=0;
                boolean match = true;
                while(counter == words.length){
                    String substringCheck = s.substring(tempIndex,tempIndex+substrLength);
                    match = Arrays.stream(words).anyMatch(str-> substringCheck.equalsIgnoreCase(str));
                    tempIndex += words[0].length();
                    if(!match){
                        counter = 0;
                        minimumIndex = tempIndex;
                    }
                }
                if(!match){
                    minimumIndex = getIndexesOfSubString(s,words,minimumIndex);
                    findSubstring(s,words);
                }
            }
        }
        return indexesOfSubString;
    }

    private int getIndexesOfSubString(String s, String[] words,int index){
        int minimumIndex = s.length();
        for(int i=0;i<words.length;i++){
            if(s.indexOf(words[i]) < minimumIndex){
                minimumIndex = s.indexOf(words[i]);
            }
        }
        return minimumIndex;
    }

    private void checkIfTheMinimumIndexHaveFullString(int index,String[] words,String s){

    }

    public static void main(String[] args){
        ConcatSubString concatSubString = new ConcatSubString();
        String[] stringArray = {};
        concatSubString.findSubstring("abcdfe",stringArray);
    }
}
