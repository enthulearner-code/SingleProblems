package dailyproblems;

public class Prefixoccurance {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arrayOfWords = sentence.split(" ");
        int searchWordLength = searchWord.length();
        for(int i =0; i< arrayOfWords.length;i++){
            if(arrayOfWords[i].length() < searchWordLength)
                continue;
            if (arrayOfWords[i].startsWith(searchWord))
                return i+1;
        }
        return -1;
    }
}
