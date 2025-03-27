package dailyproblems;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNonOverlappingEvents {
    public int maxTwoEvents(int[][] events) {
        int length = events.length;
        Arrays.sort(events,(a,b) -> Integer.compare(a[0],b[0]));

        return -1;
    }
    public static void main(String[] args){
        int[][] events = {{1,3,2},{4,5,2},{2,4,6}};
        MaxNonOverlappingEvents maxNonOverlappingEvents = new MaxNonOverlappingEvents();
        int result = maxNonOverlappingEvents.maxTwoEvents(events);
        System.out.println(result);
    }
}
