import java.util.*;

public class Solution {
    public int[] solution(int [] arr) {
        
        Queue<Integer> queue = new LinkedList<>();
        int lastNum = -1;
        for(int i=0; i<arr.length; i++){
            if(queue.isEmpty()){
                queue.offer(arr[i]);
                lastNum = arr[i];
            }else{
                if(lastNum != arr[i]){
                    queue.offer(arr[i]);
                    lastNum = arr[i];
                }
            }
        }
        int size = queue.size();
        int[] answer = new int[size];
        
        for(int i =0; i < size; i++){
            if(!queue.isEmpty()){
                answer[i] = queue.poll();
            }
        }

        return answer;
    }
}