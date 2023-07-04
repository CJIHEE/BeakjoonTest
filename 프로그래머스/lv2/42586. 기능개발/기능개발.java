import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] newProgresses = new int[progresses.length]; 
        List<Integer> progressesList = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++){
            newProgresses[i] = (100-progresses[i])/speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0){
                newProgresses[i]  += 1;
            }                     
        }
        
        int count = 1;
        int x = newProgresses[0];
        for(int i=1; i<newProgresses.length; i++){
            if(x >= newProgresses[i] ){
                count++;   
            }
            else{
                progressesList.add(count);
                count = 1;
                x = newProgresses[i];
            }
        }
        progressesList.add(count);
        
        answer = new int[progressesList.size()];
        for(int i=0; i<progressesList.size(); i++){
            answer[i] = progressesList.get(i);
        }    
    
        return answer; 
    
    }       
        
}
