import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack stack = new Stack<>();
        
        for(char x : s.toCharArray()){
            if(x == '(') stack.push('(');
            else {
                if(stack.isEmpty()) return answer = false;
                else stack.pop();
            }
        }
        
        if(!stack.isEmpty()){
          answer =false;  
        }

        return answer;
    }
}