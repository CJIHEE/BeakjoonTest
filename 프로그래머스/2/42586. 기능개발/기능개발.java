import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] arr = new int[progresses.length];
        //전체 다 배포됐을때 큰 수 만나면 배포
        //[] 다 됐을때 리스트 만들기
        for(int i=0; i< progresses.length; i++){
            if( (100-progresses[i]) % speeds[i] == 0 ) {
                arr[i] = (100-progresses[i]) / speeds[i];
            }else{
                arr[i] = (100-progresses[i]) / speeds[i] +1 ; 
            }    
        }
        
        ArrayList<Integer> answerList = new ArrayList<>();
        
        int target = arr[0];
        int count =0;
        
        for(int x : arr){
            if(x <= target){ 
                count++;
            }else{
                target = x; 
                answerList.add(count);
                count =1;
            }
        }
        
        answerList.add(count);
        
        int[] answer = new int[answerList.size()];
        
        for(int i=0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
         
        return answer;
    }
}