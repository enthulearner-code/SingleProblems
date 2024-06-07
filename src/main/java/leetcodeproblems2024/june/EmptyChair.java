package leetcodeproblems2024.june;

import java.util.Stack;

public class EmptyChair {

    private int minimumChairs(String s) {
        int count = 0;
        if (s == null || s.isEmpty()) {
            return 0;
        }
        char[] charArray = s.toCharArray();
        Stack<Character> characterStack = new Stack<>();
        for (char c : charArray) {
            if (c == 'E' || c == 'e') {
                characterStack.push('E');
                if (count < characterStack.size())
                    count = characterStack.size();
            }
            if (c == 'L' || c == 'l') {
                characterStack.pop();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "ELEELEEL";
        EmptyChair emptyChair = new EmptyChair();
        System.out.println(emptyChair.minimumChairs(s));
    }
}
