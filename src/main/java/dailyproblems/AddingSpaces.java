package dailyproblems;

public class AddingSpaces {
    public String addSpaces(String s, int[] spaces) {
        String resultantString="";
        int stringLength = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.substring(0,spaces[0]));
        stringBuilder.append(" ");
        int i=1;
        for(;i<spaces.length;i++){
            if(spaces[i] > stringLength-1)
                continue;
            stringBuilder.append(s.substring(spaces[i-1],spaces[i]));
            stringBuilder.append(" ");
        }
        stringBuilder.append(s.substring(spaces[i-1]));
        return stringBuilder.toString();
    }
    public static void main(String[] args){
        AddingSpaces addingSpaces = new AddingSpaces();
        int[] spaces = {8,13,15};
        System.out.println(addingSpaces.addSpaces("LeetcodeHelpsMeLearn",spaces));
    }
}
