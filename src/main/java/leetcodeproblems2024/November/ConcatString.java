package leetcodeproblems2024.November;

import java.util.ArrayList;
import java.util.List;

public class ConcatString {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> intList = new ArrayList<>();
        int wordLength = s.length();
        int stringLength = words[0].length();
        int concatStringLength = words.length * stringLength;
        int cutIndex = concatStringLength - stringLength;
        if(s.isEmpty() || s.length() < concatStringLength){
            return intList;
        }
        int index = s.indexOf(words[0]);
        return new ArrayList<>();
    }
    public static void main(String[] args){
        ConcatString concatString = new ConcatString();
        String[] words = {"foo","bar"};
        concatString.findSubstring("foobarcheckbarfoomain",words);

    }
}
