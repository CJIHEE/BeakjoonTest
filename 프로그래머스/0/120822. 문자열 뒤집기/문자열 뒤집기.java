class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
   
        int size = my_string.length();
        for(int i=size-1; i>=0; i--){
            answer.append(my_string.charAt(i));
        }
        
        return answer.toString();
    }
}