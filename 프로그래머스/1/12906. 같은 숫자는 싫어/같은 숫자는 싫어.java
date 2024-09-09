import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();

        int lastNum = -1;
        for(int x : arr){
            if(x != lastNum){
                queue.add(x);    
            }
            lastNum=x;
        }        
        int queueSize = queue.size();
        int[] answer = new int[queueSize];
        for(int i=0; i < queueSize; i++){
            answer[i] = queue.poll();
        }

        return answer;
    }
}