package dailyproblems;

public class StringSubSequence {
    public boolean canMakeSubsequence(String str1, String str2) {
        int matchingChars = 0;
        int prevIndex = -1;
        int str2length = str2.length();
        int str1length = str1.length();
        for(int i=0;i<str2length;i++){
            for(int j=prevIndex+1; j<str1length;j++){
                char character = str1.charAt(j);
                char nextChar = str1.charAt(j);
                if(nextChar == 'z')
                    nextChar = 'a';
                else
                    ++nextChar;
                char compareChar = str2.charAt(i);
                if(compareChar == character || compareChar == nextChar){
                    prevIndex = j;
                    matchingChars++;
                    break;
                }
            }
        }
        if(matchingChars == str2length)
            return true;
        return false;
    }

    public static void main(String[] args){
        StringSubSequence stringSubSequence = new StringSubSequence();
        System.out.println(stringSubSequence.canMakeSubsequence("eqaed","qafd"));
    }
}
