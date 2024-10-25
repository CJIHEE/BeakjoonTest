class Solution {
    public String solution(String rsp) {
        String answer = "";
        // 2 ->0 
        // 0 -> 5
        // 5 ->2
        
        for(char x : rsp.toCharArray()){
            if(x == '2') answer+="0";
            else if(x == '0') answer+="5";
            else answer+="2";    
        }
        
        return answer;
    }
}