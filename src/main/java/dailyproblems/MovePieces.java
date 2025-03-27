package dailyproblems;

public class MovePieces {
    public boolean canChange(String start, String target) {
        int i=0,j=0,length = start.length();
        if(start.equals(target))
            return true;
        while(i < length || j < length){
            while( i < length && start.charAt(i) == '_')
                i++;
            while( j < length && target.charAt(j) == '_')
                j++;
            if(start.charAt(i) != target.charAt(j))
                return false;
            if((start.charAt(i) == 'L' && i < j) || (start.charAt(i) == 'R' && i > j))
                return false;
            i++;
            j++;
        }
        return (i==j && i==length);
    }
}
