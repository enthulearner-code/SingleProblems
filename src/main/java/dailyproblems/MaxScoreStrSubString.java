package dailyproblems;

public class MaxScoreStrSubString {
    public int maxScore(String s) {
        int length = s.length();
        int onesLength = 0;
        int result = 0;
        char[] charArray = s.toCharArray();
        for(char c : charArray){
            if(c == '1')
                onesLength++;
        }
        if(s.charAt(0)=='0'){
            result += s.indexOf(1) + onesLength;
        }
        else{
            result += onesLength-1;
        }
        return -1;
    }
}
