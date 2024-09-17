import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Queue queue = new LinkedList<>();
        for(char x : s.toCharArray() ){
            queue.add(Character.toString(x));
        }
        int flag = 0;
        int count =0;
        int compareCount =0;
       
        while(!queue.isEmpty()){
            if(")".equals(queue.peek()) && flag==0 ){
                return false;
            }
            else {
                if("(".equals(queue.peek()) ){
                    count++;
                }else{
                    compareCount++;
                }
                flag++;
                queue.poll();   
            }
            if(count == compareCount){
                flag = 0;
            }
        }
        if(count != compareCount){
            answer = false;
        }
        return answer;
    }
}