package dailyproblems;

public class Brainpower {
    public long mostPoints(int[][] questions){
        int length = questions.length;
        long[] points = new long[length+1];
        long totalPoints=0,skipPoints=0;
        long result = 0;
        for(int i=length-1;i>=0;i--){
            int currentPoints = questions[i][0];
            int brainpower = questions[i][1];
            totalPoints = (i+brainpower < length)? points[i+brainpower+1]+currentPoints : currentPoints;
            skipPoints = (i+1 < length) ? points[i+1] : 0;
            points[i] = Math.max(totalPoints,skipPoints);
        }
        return points[0];
    }

    public static void main(String[] args){
        Brainpower brainpower = new Brainpower();
        int[][] testArray = {{1,1},{2,2},{3,3},{4,4},{5,5}};
        long res = brainpower.mostPoints(testArray);
        System.out.println(res);
    }
}
