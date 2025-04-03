package dailyproblems;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ABCSubstring {
    public int numberOfSubstrings(String s) {
        int subStringCount = 0;
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            int aPos = -1, bPos = -1, cPos = -1;
            int maxPos = -1;
            if (s.charAt(i) == 'a') {
                bPos = s.indexOf('b', i);
                cPos = s.indexOf('c', i);
                if (bPos == -1 || cPos == -1)
                    break;
                maxPos = bPos > cPos ? bPos : cPos;

            }
            if (s.charAt(i) == 'b') {
                aPos = s.indexOf('a', i);
                cPos = s.indexOf('c', i);
                if (aPos == -1 || cPos == -1)
                    break;
                maxPos = aPos > cPos ? aPos : cPos;

            }
            if (s.charAt(i) == 'c') {
                aPos = s.indexOf('a', i);
                bPos = s.indexOf('b', i);
                if (aPos == -1 || bPos == -1)
                    break;
                maxPos = aPos > bPos ? aPos : bPos;

            }
            subStringCount += n - maxPos;
        }
        return subStringCount;
    }

    public static void main(String[] args){
        double testdouble=Double.parseDouble("132770.00");
        BigDecimal testBigD = new BigDecimal("132770.70");
        testBigD = testBigD.setScale(2,BigDecimal.ROUND_HALF_UP);
        String test = testBigD.toString();
        System.out.println(test);
    }
}
