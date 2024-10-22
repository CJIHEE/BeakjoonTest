import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Queue<Integer> queue = new LinkedList<>();
        int target = -1;
        for(int x : arr){
            if(x != target){
                queue.offer(x);
                target = x;
            }
        }
        
        int size = queue.size();
        
        int[] answer = new int[size];
        
        for(int i=0; i < size; i++){
            answer[i] = queue.poll();
        }

        return answer;
    }
}