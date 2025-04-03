package dailyproblems;

import java.util.Arrays;

public class MinimumRecolors {
    public int minimumRecolors(String blocks, int k) {
        int blockSize = blocks.length();
        int minimumSwaps = -1;
        for(int i=0;i<=blockSize-k;i++){
            String blocksToCheck = blocks.substring(i,i+k);
            int whiteBlocksCount = checkForNumberOfWhites(blocksToCheck);
            if(minimumSwaps == -1 || minimumSwaps > whiteBlocksCount)
                minimumSwaps = whiteBlocksCount;
        }
        return minimumSwaps;
    }

    private int checkForNumberOfWhites(String stringToCheck){
        int whiteBlockCount = 0;
        for(int i=0;i<stringToCheck.length();i++){
            if(stringToCheck.charAt(i)=='W')
                whiteBlockCount++;
        }
        return whiteBlockCount;
    }

    public static void main(String[] args){
        String testString = "WBBWWBBWBW";
        MinimumRecolors minimumRecolors = new MinimumRecolors();
        int result = minimumRecolors.minimumRecolors(testString,7);
        System.out.println(result);
    }
}
